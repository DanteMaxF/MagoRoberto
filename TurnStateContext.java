import java.awt.Graphics;

public class TurnStateContext {
	private TurnState1 t1;
	private TurnState2 t2;
	private TurnoState current;
	private WinningWord theWord;
	
	public TurnStateContext(WinningWord w){
		t1 = new TurnState1(this);
		t2 = new TurnState2(this);
		theWord = w;
		current = t1;
	}
	
	public TurnoState getT1(){
		return t1;
	}
	
	public TurnoState getT2(){
		return t2;
	}
	
	public void setCurrent(TurnoState ts){
		current = ts;
	}
	
	public void turn1(){
		current.turn1();
	}
	
	public void turn2(){
		current.turn2();
	}
	
	public void turnRender(Graphics g){
		current.turnRender(g);
	}
	
	public String checkState(){
		return current.checkState();
	}
	
	public void addPoint(){
		current.addPoint();
	}
}
