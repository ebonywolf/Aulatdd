package gui;


import game.Coord;
import game.Gameobj;

public abstract class DrawableObj extends Gameobj implements Drawable {

	DrawableObj( ){
		super();
	}

	public DrawableObj(Gameobj obj) {
		super(obj);
	}
	

	

}
