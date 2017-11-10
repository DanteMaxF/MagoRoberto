/*
 * GameStateRunning.java
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


import java.awt.Graphics;

public class GameStateRunning implements GameState {
	GameStateContext gc;
	private Board tablero;
	
	public GameStateRunning(GameStateContext gc){
		this.gc = gc;
		tablero = new Board();
	}
	
	
	public void end(){

		gc.setCurrent(gc.getGameOver(tablero.winningWord()));
	}
	


	
	public void render(Graphics g){

		tablero.paintBoard(g);
	}

	
	public void update(){

		if(tablero.checVictim()){
			end();
		}
		if(tablero.won()){
			gc.setCurrent(gc.getWin(tablero.actualTurnState(), tablero.winningWord()));
		}
	}
	
	@Override
	public void checkButtons(int x, int y) {
		tablero.updateButtons(x, y);
	}
	@Override
	public void win() {}
	@Override
	public void mainMenu() {}
	public void resume(){}
}

