
import java.util.Random;

public class WordList {
	private String[] wordlist = {"MAGO", "ROBERTO", "VIDEOJUEGO", "MARAVILLA", "MAGIA", "LAPIZ", "VARITA", "JUEGO", "JUGUETE", "DIVERSION", "SOMBRERO", "CAPA", "CONEJO", "LIBRO"};
	private String wordPicked;
	
	public WordList(){
		wordPicked = "";
		takeRandomWord();
	}
	
	public String getWordPicked(){
		return wordPicked;
	}
	
	public void takeRandomWord(){
		Random r = new Random();
		int n = r.nextInt(wordlist.length);
		
		wordPicked = wordlist[n];
	}
	
	
}
