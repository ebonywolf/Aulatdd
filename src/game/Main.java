package game;

import gui.Renderer;
import gui.Window;

public class Main {
	public static void main(String[] args) {
		Renderer rend = new Renderer();
		Game game = new Game(rend);
		game.PingaPonga();
		
		(new Thread(game)).start();		
		Window a = new Window();
		a.setRenderer(rend);

	}
}
