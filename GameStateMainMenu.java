
import java.awt.Graphics;

public class GameStateMainMenu implements GameState{
	GameStateContext gc;
	MainMenu menu;
	
	public GameStateMainMenu(GameStateContext gc){
		this.gc = gc;
		menu = new MainMenu();
	}
	
	@Override
	public void end() {
	}


	@Override
	public void resume() {
	}

	@Override
	public void render(Graphics g) {
		menu.paint(g);
	}

	@Override
	public void update() {
		if(menu.updateData()){
			gc.setCurrent(gc.getRun());
		}
	}

	@Override
	public void mainMenu() {
		// TODO Auto-generated method stub
		
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
