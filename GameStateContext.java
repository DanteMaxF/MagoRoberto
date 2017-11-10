/*
 * GameStateContext.java
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

public class GameStateContext {
	
	private GameStateRunning run;
	private GameStateGameOver go;
	private GameStateMainMenu mainMenu;
	private GameStateWin win;
	private GameState current;
	
	public GameStateContext(){
		run = new GameStateRunning(this);
		go = new GameStateGameOver(this);
		mainMenu = new GameStateMainMenu(this);
		win = new GameStateWin(this);
		current = mainMenu;
	}
	
	public GameState getRun(){
		return run;
	}
	

	
	public GameState getGameOver(String word){
		go.setWord(word);
		return go;
	}
	
	public GameState getMainMenu(){
		return mainMenu;
	}
	
	public GameState getWin(String winner, String word){
		win.setWinner(winner);
		return win;
	}
	
	public void setCurrent(GameState gs){
		current = gs;
	}
	
	public void end(){
		current.end();
	}
	
	public void resume(){
		current.resume();
	}
	

	
	public void mainMenu(){
		current.mainMenu();
	}
	
	public void update() {
		current.update();
	}
	
	public void render(Graphics g){
		current.render(g);
	}
	
	public void checkButtons(int x, int y){
		current.checkButtons(x,y);
	}
	
	public void win(){
		current.win();
	}
}

