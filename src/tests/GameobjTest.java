package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import game.Coord;
import game.Gameobj;

public class GameobjTest {
	
	Gameobj obj;
	
	@Before
	public void configure() {
		obj = new Gameobj();
	}
	
	@Test
	public void moveToPoint() {
		obj.moveto(5,5);
		assertEquals(new Coord(5,5), obj.getPosition());	
	}
	@Test
	public void moveDistance() {
		obj.moveto(2, 2);
		obj.move( new Coord(4,4));
		assertEquals(new Coord(6,6), obj.getPosition());
	}
	
	@Test
	public void moveNaturally() {
		obj.moveto(2, 2);
		obj.setSpeedVector(new Coord(2,3));
		obj.move();
		assertEquals(new Coord(4,5), obj.getPosition());
	}

}
