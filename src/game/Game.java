package game;

import java.awt.Color;
import java.util.ArrayList;

import gui.Drawable;
import gui.DrawableObj;
import gui.Renderer;
import gui.SquareShape;

public class Game implements Runnable {
	protected ArrayList<DrawableObj> objects=new ArrayList<DrawableObj>();
	Renderer renderer;
	Game(Renderer rend){
		renderer=rend;
		
	}
	
	void PingaPonga() {
		objects.clear();
		renderer.clearImages();
		
		SquareShape randomSquare = new SquareShape(50, 50, new Color(255,0,0));
		objects.add(randomSquare);
		renderer.addImage(randomSquare);
	}
	
	@Override
	public void run() {
		while(true) 
		{
			
			try {
	            Thread.sleep((long) 16);
	        } catch (InterruptedException e1) {
	            // TODO Auto-generated catch block
	            e1.printStackTrace();
	        }
		}
		
	}
	
	
}
