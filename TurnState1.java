import java.awt.Graphics;

public class TurnState1 implements TurnoState{
	
	private Players player1;
	TurnStateContext ts;
	
	public TurnState1(TurnStateContext ts){
		this.ts = ts;
		player1 = new Players("Jugador 1");
	}
	
	@Override
	public void turn1() {
		System.out.println("Ya es el turno 1");
	}

	@Override
	public void turn2() {
		ts.setCurrent(ts.getT2());
	}

	@Override
	public void turnRender(Graphics g) {
		player1.paint(g);
	}

	@Override
	public String checkState() {
		return "P1";
	}

	@Override
	public void addPoint() {
		player1.scoreUp();
	}

}
