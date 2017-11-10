import java.awt.Color;
import java.awt.Graphics;

public class Victim {
	private int intentos;
	
	public Victim(){
		this.intentos = 0;
	}

	public int getIntentos() {
		return intentos;
	}

	public void setIntentos(int intentos) {
		this.intentos = intentos;
	}
	
	public void loss(){
		intentos++;
	}
	
	public boolean isDead(){
		if(intentos == 6){
			return true;
		}
		return false;
	}
	
	public void paint(Graphics g){
		g.setColor(Color.black);
		if(intentos > 0){
			g.fillOval(170, 180, 60, 60);
		}
		if(intentos > 1){
			g.fillRect(195, 190, 10, 130);
		}
		if(intentos > 2){
			g.fillRect(195, 260, 50, 10);
		}
		if(intentos > 3){
			g.fillRect(155, 260, 50, 10);
		}
		if(intentos > 4){
			g.fillRect(195, 320, 25, 10);
			g.fillRect(220, 320, 10, 40);
			g.drawString("ULTIMO INTENTO", 150, 400);
		}
		if(intentos > 5){
			g.fillRect(170, 320, 25, 10);
			g.fillRect(170, 320, 10, 40);
			
		}
	}
}
