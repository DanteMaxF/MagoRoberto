import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.ListIterator;

public class WinningWord {
	private ArrayList<Character> manyChars;
	private char[] charWord;

	
	public WinningWord(String word){
		manyChars = new ArrayList<Character>();
		charWord = word.toCharArray();
		assignChars();
	}
	
	private void assignChars(){
		for(int i=0; i<charWord.length; i++){
			manyChars.add(new Character(charWord[i]));
		}
	}
	
	public boolean checkChar(char c){
		boolean res = false;
		Character aux;
		ListIterator<Character> itr = manyChars.listIterator();
		while(itr.hasNext()){
			aux = itr.next();
			if(aux.getValue() == c){
				aux.switchFound();
				res = true;
			}
		}
		return res;
	}
	
	public boolean checkWinning(){
		boolean res = true;
		Character aux;
		ListIterator<Character> itr = manyChars.listIterator();
		while(itr.hasNext()){
			aux = itr.next();
			if(!aux.getFound()){
				res = false;
			}
		}
		return res;
	}
	/*
	public boolean wordComplete(){
		Character aux;
		ListIterator<Character> itr = manyChars.listIterator();
		while(itr.hasNext()){
			aux = itr.next();
			if(!aux.getFound()){
				return false;
			}
		}
		return true;
	}
	*/
	public void paint(Graphics g){
		int x = 50;
		Character aux;
		g.setFont(new Font("Arial", Font.PLAIN, 80));
		g.setColor(Color.white);
		ListIterator<Character> itr = manyChars.listIterator();
		while(itr.hasNext()){
			aux = itr.next();
			g.drawString(""+aux.checkChar(), x, 600);
			x += 90;
		}
	}
}
