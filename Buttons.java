import java.awt.Graphics;
import java.util.ArrayList;
import java.util.ListIterator;

public class Buttons {
	private ArrayList<MyGraphics> manyButtons;

	
	public Buttons(){
		manyButtons = new ArrayList<MyGraphics>();
		generateButtons();
	}
	
	private void generateButtons(){
		manyButtons.add(new MyGraphics(600, 50, 50, 50, 'A'));
		manyButtons.add(new MyGraphics(660, 50, 50, 50, 'B'));
		manyButtons.add(new MyGraphics(720, 50, 50, 50, 'C'));
		manyButtons.add(new MyGraphics(780, 50, 50, 50, 'D'));
		manyButtons.add(new MyGraphics(840, 50, 50, 50, 'E'));
		manyButtons.add(new MyGraphics(900, 50, 50, 50, 'F'));
		manyButtons.add(new MyGraphics(960, 50, 50, 50, 'G'));
		manyButtons.add(new MyGraphics(1020, 50, 50, 50, 'H'));
		manyButtons.add(new MyGraphics(1080, 50, 50, 50, 'I'));
		manyButtons.add(new MyGraphics(1140, 50, 50, 50, 'J'));
		manyButtons.add(new MyGraphics(1200, 50, 50, 50, 'K'));
		manyButtons.add(new MyGraphics(600, 110, 50, 50, 'L'));
		manyButtons.add(new MyGraphics(660, 110, 50, 50, 'M'));
		manyButtons.add(new MyGraphics(720, 110, 50, 50, 'N'));
		manyButtons.add(new MyGraphics(780, 110, 50, 50, 'O'));
		manyButtons.add(new MyGraphics(840, 110, 50, 50, 'P'));
		manyButtons.add(new MyGraphics(900, 110, 50, 50, 'Q'));
		manyButtons.add(new MyGraphics(960, 110, 50, 50, 'R'));
		manyButtons.add(new MyGraphics(1020, 110, 50, 50, 'S'));
		manyButtons.add(new MyGraphics(1080, 110, 50, 50, 'T'));
		manyButtons.add(new MyGraphics(1140, 110, 50, 50, 'U'));
		manyButtons.add(new MyGraphics(1200, 110, 50, 50, 'V'));
		manyButtons.add(new MyGraphics(600, 170, 50, 50, 'W'));
		manyButtons.add(new MyGraphics(660, 170, 50, 50, 'X'));
		manyButtons.add(new MyGraphics(720, 170, 50, 50, 'Y'));
		manyButtons.add(new MyGraphics(780, 170, 50, 50, 'Z'));
	}
	
	public char checkButton(int ox, int oy){
		MyGraphics aux;
		ListIterator<MyGraphics> itr = manyButtons.listIterator();
		while(itr.hasNext()){
			aux = itr.next();
			if(ox >= aux.getX() && ox <= (aux.getX()+aux.getWidth()) && oy >= aux.getY() && oy <= (aux.getY()+aux.getHeight())){
				return aux.getLetter();
			}
		}
		System.out.println("Colisiona con NADA");
		return '*';
	}
	
	public void paint(Graphics g){
		MyGraphics aux;
		ListIterator<MyGraphics> itr = manyButtons.listIterator();
		while(itr.hasNext()){
			aux = itr.next();
			aux.paint(g);
		}
	}
}
