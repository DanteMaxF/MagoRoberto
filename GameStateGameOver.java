/*
 * GameStateGameOver.java
 * 
 * Copyright 2017 Edgar Daniel Fernández Rodríguez <edgar.fernandez@me.com>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 * 
 * 
 */
import java.awt.*;

public class GameStateGameOver implements GameState {
	GameStateContext gc;
	private String word;

	
	public GameStateGameOver(GameStateContext gc){
		this.gc = gc;

	}
	public void end(){
		System.out.println("No se puede dar end en GameOver");
	}
	
	
	public void resume(){
		System.out.println("No se puede dar resume en GameOver");
	}
	
	public void render(Graphics g){
		g.setColor(new Color(57,27,96));
		g.fillRect(0, 0, 1280, 720);
		g.setColor(Color.white);
		g.setFont(new Font("Arial", Font.PLAIN, 80));
		g.drawString("PERDIERON",400,350);
		g.setFont(new Font("Arial", Font.PLAIN, 40));
		g.drawString("La palabra del mago fue: "+word, 320, 400);
		g.setFont(new Font("Arial", Font.PLAIN, 14));
		g.drawString("presiona ESC para salir",550,550);
		
		g.setFont(new Font("Arial", Font.PLAIN, 14));
		g.drawString("Por: Dante Flores", 0, 715);
	}
	
	public void update(){
	
	}
	@Override
	public void mainMenu() {
		System.out.println("Imposible regresar al menu");
		
	}
	
	public void setWord(String w){
		word = w;
	}
	@Override
	public void checkButtons(int x, int y) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void win() {
		// TODO Auto-generated method stub
		
	}

}

