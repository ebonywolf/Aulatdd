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
	
	Gameobj ball;
	
	Gameobj leftwall ;
	Gameobj topwall;
	Gameobj rightwall;
	Gameobj botwall ;
	
	
	Game(Renderer rend){
		renderer=rend;
		
	}
	
	void PingaPonga() {
		objects.clear();
		renderer.clearImages();
		
		 leftwall = new Gameobj(new Coord(0,0), new Coord(50,600));
		 topwall = new Gameobj(new Coord(0,0), new Coord(800,50));
		 rightwall = new Gameobj(new Coord(750,0), new Coord(50,600));
		 botwall = new Gameobj(new Coord(0,550), new Coord(800,50));
		
		addWall(leftwall, new Color(255,0,0));
		addWall(topwall,new Color(150,0,150));
		addWall(rightwall,new Color(150,150,0));
		addWall(botwall,new Color(0,0,255));
		
		 ball = new Gameobj(new Coord(250,250), new Coord(50,50));
		SquareShape randomSquare = new SquareShape(ball, new Color(0,255,0));
		ball.setSpeedVector(new Coord(2,2));
		renderer.addImage(randomSquare);
		
	}
	void addWall(Gameobj obj, Color c) {
		SquareShape randomSquare = new SquareShape(obj, c);
		objects.add(randomSquare);
		renderer.addImage(randomSquare);
	}
	
	@Override
	public void run() {
		while(true) 
		{	
			ball.move();
			if(ball.collides(leftwall) || ball.collides(rightwall) )
				ball.speedVector.x*=-1;
			if(ball.collides(topwall) || ball.collides(botwall) )
				ball.speedVector.y*=-1;
			
			
			try {
	            Thread.sleep((long) 16);
	        } catch (InterruptedException e1) {
	            // TODO Auto-generated catch block
	            e1.printStackTrace();
	        }
		}
		
	}
	
	
}
