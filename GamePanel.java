
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class GamePanel extends JPanel implements Runnable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final int PWIDTH = 1280;
	private static final int PHEIGHT = 720; 
	
	private Thread animator; 
	private volatile boolean running = false;
	private volatile boolean gameOver = false;
	private GameStateContext context;

	
	public GamePanel(){
		setBackground(Color.white);
		setPreferredSize(new Dimension(PWIDTH,PHEIGHT));
		setFocusable(true);
		requestFocus();
		readyForTermination();
		
		
		addMouseListener( new MouseAdapter() { 
			public void mouseReleased(MouseEvent e) { 
				testPress(e.getX(), e.getY());
			}
		});
		
		context = new GameStateContext();
	} 
	
	public void addNotify()
	{
		super.addNotify();
		startGame();
	}//addNotify
	
	
	private void startGame()
	{
		if(animator == null || !running){
			animator = new Thread(this);
			animator.start();
		}
	}
	
	/*public void stopGame(){
		running = false;
	}*///stopGame()
	
	public void run(){
		running = true;
		while(running){
			gameUpdate();
			gameRender();
			paintScreen();
			
			try{
				Thread.sleep(5);
			}catch(InterruptedException ex){}
		}
		System.exit(0);
	}//run()
	
	private void gameUpdate(){
		context.update();

	}//gameUpdate()
	
	private Graphics dbg;
	private Image dbImage = null;
	
	private void gameRender(){
		if(dbImage == null){
			dbImage = createImage(PWIDTH,PHEIGHT);
			if(dbImage == null){
				System.out.println("dbImage is null");
				return;
			}else{
				dbg = dbImage.getGraphics();
			}
		}
		dbg.setColor(Color.white);
		dbg.fillRect(0,0,PWIDTH,PHEIGHT);
		context.render(dbg);
	}//gameRender()
	

	public void paintComponent(Graphics g){
		super.paintComponent(g);
		if(dbImage != null)
			g.drawImage(dbImage, 0, 0, null);
	}
	
	private void readyForTermination() {
		addKeyListener( new KeyAdapter() { // listen for esc, q, end, ctrl-c
			public void keyPressed(KeyEvent e) { 
				int keyCode = e.getKeyCode();
				if ((keyCode == KeyEvent.VK_ESCAPE)) {
					context.end();
					running = false;
				}
				if(keyCode == KeyEvent.VK_R){
					context.resume();
				}
			} 
			});
	} // end of readyForTermination()
	
	
	
	private void testPress(int x, int y)
   
    {
      if (!gameOver) {
        
    	  System.out.println(x + " " + y);
    	  context.checkButtons(x,y);
    	  
		} 
	}
	
	private void paintScreen(){
		Graphics g;
		try{
			g = this.getGraphics();
			if((g != null) && (dbImage != null))
				g.drawImage(dbImage,0,0,null);
			Toolkit.getDefaultToolkit().sync();
			g.dispose();
		}
		catch(Exception e){
			System.out.println("Graphics context error: "+e);
		}
	}
	

	
	public static void main(String args[]){
	 JFrame app = new JFrame("El Mago Roberto BETA");
     app.getContentPane().add(new GamePanel(), BorderLayout.CENTER);
     app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

     app.pack();
     app.setResizable(false);  
     app.setVisible(true);
	}
}

