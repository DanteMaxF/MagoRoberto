import java.awt.*;

public class CuentaRegresiva {
	private int segundos;
	
	public CuentaRegresiva(){
		segundos = 8;
	}
	
	public int getSegundos(){
		return segundos;
	}
	public void setSegundos(int seg){
		segundos = seg;
	}
	
	public boolean tick(){
		System.out.println(segundos);
		try{
			Thread.sleep(1000);
		}catch(InterruptedException ex){
			Thread.currentThread().interrupt();
		}
		segundos--;
		return (segundos == 0);
	}
	
	public void paint(Graphics g){
		if(segundos <= 10){
			if(segundos % 2 == 0){
				g.setColor(Color.red);
			}else{
				g.setColor(Color.white);
			}
		}
		g.setColor(Color.white);
		g.setFont(new Font("Arial", Font.PLAIN, 50));
		g.drawString("El juego comienza en: "+segundos, 640, 500);
	}
	
	

}
