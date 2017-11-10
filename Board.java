import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class Board {
	private WordList wl;
	private WinningWord ww;
	private MyGraphics fondo2;
	private Buttons botones;
	private TurnStateContext tContext;
	private Victim dude;
	private char letterPicked;
	
	public Board(){
		wl = new WordList();
		ww = new WinningWord(wl.getWordPicked());
		fondo2 = new MyGraphics(0,0,"resources/background2.png",1280,720);
		botones = new Buttons();
		dude = new Victim();
		tContext = new TurnStateContext(ww);
	}
	public String winningWord(){
		return wl.getWordPicked();
	}
	public void paintBoard(Graphics g){
		fondo2.paint(g);
		g.setFont(new Font("Arial", Font.PLAIN, 14));
		g.setColor(Color.black);
		ww.paint(g);
		botones.paint(g);
		tContext.turnRender(g);
		dude.paint(g);
		g.setFont(new Font("Arial", Font.PLAIN, 14));
		g.drawString("Por: Dante Flores", 0, 715);
	}
	
	public boolean checVictim(){
		return (dude.isDead());
	}
	
	public boolean won(){
		return ww.checkWinning();
	}
	
	public void updateButtons(int x, int y){
		System.out.println(botones.checkButton(x, y));
		
		letterPicked = botones.checkButton(x,y);			//LetterPicked es el caracter que el usuario ingresa
		if(!ww.checkChar(letterPicked) && letterPicked != '*'){	//Si falla al adivinar el caracter. El asterisco significa si presiono en un lugar que no sea un boton
			dude.loss();
			System.out.println("Turnos: "+dude.getIntentos());
			if(tContext.checkState() == "P1"){        		//Cambia de turno cuando falla
				tContext.turn2();
			}else if(tContext.checkState() == "P2"){
				tContext.turn1();
			}                                                                                
		}else if(letterPicked != '*'){
			tContext.addPoint();							// Le da un punto al jugador que adivine una letra
		}
	}
	
	public String actualTurnState(){
		return tContext.checkState();
	}
}
