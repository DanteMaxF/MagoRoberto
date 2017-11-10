import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class GameStateWin implements GameState{
	GameStateContext gc;
	private String winner;

	public GameStateWin(GameStateContext gc){
		this.gc = gc;
	}
	
	public void setWinner(String winner){
		this.winner = winner;
	}

	
	@Override
	public void end() {
		
	}

	@Override
	public void resume() {
		
	}

	@Override
	public void mainMenu() {
		
	}

	@Override
	public void render(Graphics g) {
		String ganador;
		g.setColor(new Color(244,200,66));
		g.fillRect(0, 0, 1280, 720);
		if(winner =="P2"){
			g.setColor(Color.blue);
			ganador = "Jugador 2";
		}else{
			g.setColor(new Color(181,41,41));
			ganador = "Jugador 1";
		}
		g.setFont(new Font("Arial", Font.PLAIN, 80));
		g.drawString("FELICIDADES", 400, 350);
		g.setFont(new Font("Arial", Font.PLAIN, 40));
		g.drawString("El "+ganador+" ha adivinado la ultima letra", 320, 400);

		g.setFont(new Font("Arial", Font.PLAIN, 14));
		g.drawString("presiona ESC para salir",550,550);
		
		g.setFont(new Font("Arial", Font.PLAIN, 14));
		g.drawString("Por: Dante Flores", 0, 715);
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void checkButtons(int x, int y) {
		
	}

	@Override
	public void win() {

	}



}
