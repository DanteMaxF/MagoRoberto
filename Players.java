import java.awt.Color;
import java.awt.Graphics;

public class Players {
	private String name;
	private int score;
	
	public Players(String name){
		this.name = name;
		score = 0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	public void paint(Graphics g){
		if(name == "Jugador 1"){
			g.setColor(Color.red);
			g.fillRect(600, 300, 200, 80);
			g.setColor(Color.white);
			g.drawString("Jugador 1", 650, 350);
			g.drawString("Score: "+score, 650, 370);
		}else{
			g.setColor(Color.blue);
			g.fillRect(850, 300, 200, 80);
			g.setColor(Color.white);
			g.drawString("Jugador 2", 900, 350);
			g.drawString("Score: "+score, 900, 370);

		}
	}
	
	public void scoreUp(){
		score++;
	}
	
}
