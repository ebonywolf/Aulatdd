package gui;

import java.awt.Color;
import java.awt.Graphics2D;

import game.Coord;
import game.Gameobj;

public class SquareShape extends DrawableObj{
	int width,height;
	Color color;
	public SquareShape( int width, int height, Color color) {
		super();
		this.width=width;
		this.height=height;
		this.color = color;
	}
	public SquareShape(Gameobj obj, int width, int height, Color color) {
		super(obj);
		this.width=width;
		this.height=height;
		this.color = color;
	}
	Coord position;
	
	@Override
	public void draw(Graphics2D g) {
		g.setColor(color);
		g.drawRect((int)getPosition().x, (int)getPosition().y, width, height);
		g.fillRect((int)getPosition().x, (int)getPosition().y, width, height);
		
	}

	
	
}
