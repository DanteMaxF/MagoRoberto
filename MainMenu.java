import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class MainMenu {
	private CuentaRegresiva counter;
	private MyGraphics anuncio;
	private MyGraphics fondo;
	
	public MainMenu(){
		fondo = new MyGraphics(0,0,"resources/background.png",1280,720);
		counter = new CuentaRegresiva();
		anuncio = new MyGraphics(0,0,"resources/mainMenuText.png", 1250,351);
	}
	
	public void paint(Graphics g){
		fondo.paint(g);
		g.setColor(Color.black);
		g.setFont(new Font("Arial", Font.PLAIN, 20));
		g.drawRect(20, 0, 1190, 350);
		g.setColor(Color.cyan);
		g.fillRect(21, 1, 1189, 349);
		g.setColor(Color.black);
		anuncio.paint(g);
		counter.paint(g);
		g.setFont(new Font("Arial", Font.PLAIN, 20));
		g.setFont(new Font("Arial", Font.PLAIN, 14));
		g.drawString("Por: Dante Flores", 0, 715);

	}
	
	public boolean updateData(){
		if(counter.tick()){
			return true;
		}
		return false;
	}
	
}
