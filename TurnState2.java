import java.awt.Graphics;

public class TurnState2 implements TurnoState{
	TurnStateContext ts;
	private Players player2;

	
	public TurnState2(TurnStateContext ts) {
		this.ts = ts;
		player2 = new Players("Jugador 2");
	}

	@Override
	public void turn1() {
		ts.setCurrent(ts.getT1());
	}

	@Override
	public void turn2() {
		System.out.println("Ya es el turno 2");
	}

	@Override
	public void turnRender(Graphics g) {
		player2.paint(g);
	}

	@Override
	public String checkState() {
		return "P2";
	}

	@Override
	public void addPoint() {
		player2.scoreUp();
	}

}
