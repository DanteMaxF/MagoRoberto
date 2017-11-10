import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;

public class MyGraphics {
	protected int x, y, width, height;
	protected Image image;
	protected String imageSource;
	protected char letter;
	
	public MyGraphics(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	//Imagenes
	public MyGraphics(int x, int y, String imageSource, int width, int height){
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.imageSource = imageSource;
		setImageByName(imageSource);
	}
	
	//Botones del abecedario
	public MyGraphics(int x, int y, int width, int height, char letter){
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.letter = letter;
		imageSource = "";
	}
	
	
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public char getLetter() {
		return letter;
	}

	public void setLetter(char letter) {
		this.letter = letter;
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public void setImageByName(String name){
		image = new ImageIcon(name). getImage();
	}
	

	public void paint(Graphics g){
		if(imageSource == ""){
			g.setColor(Color.ORANGE);
			g.setFont(new Font("Arial", Font.PLAIN, 20));
			g.fillRect(x, y, width, height);
			g.setColor(Color.black);
			g.drawString(""+letter, x+(width/2)-8, y+(height/2)+8);
		}else{
			g.drawImage(image, x, y, width, height, null);
		}
	}
}
