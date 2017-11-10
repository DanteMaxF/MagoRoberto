import java.awt.*;

interface TurnoState {
	
	public void turn1();
	public void turn2();
	public String checkState();
	public void addPoint();
	public void turnRender(Graphics g);

}
