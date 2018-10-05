package gui;

import java.awt.Color;
import java.awt.Graphics2D;

import game.Coord;
import game.Gameobj;

public class SquareShape extends DrawableObj{

	Color color;
	public SquareShape(  Color color) {
		super();
		this.color = color;
	}
	public SquareShape(Gameobj obj,Color color) {
		super(obj);
		this.color = color;
	}
	Coord position;
	
	@Override
	public void draw(Graphics2D g) {
		g.setColor(color);
        
		g.drawRect((int)getPosition().x, (int)getPosition().y, (int)getHitbox().x, (int)getHitbox().y);
		g.fillRect((int)getPosition().x, (int)getPosition().y, (int)getHitbox().x, (int)getHitbox().y);
		
	}

	
	
}
