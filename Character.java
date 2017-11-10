

public class Character {
	private char value;
	private boolean found;
	
	public Character(){
		value = ' ';
		found = false;
	}
	
	public Character(char val){
		value = val;
		found = false;
	}
	
	public void setValue(char val){
		value = val;
	}
	
	public char getValue(){
		return value;
	}
	
	public void switchFound(){
		found = true;
	}
	
	public boolean getFound(){
		return found;
	}
	
	public char checkChar(){
		if(found){
			return value;
		}else{
			return '_';
		}
	}
}
