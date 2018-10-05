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
		obj.move();
		obj.move();
		assertEquals(new Coord(8,11), obj.getPosition());
	}
	
	@Test 
	public void noCollision() {
		Gameobj one = new Gameobj(new Coord(0,0), new Coord(50,50));
		Gameobj two = new Gameobj(new Coord(50,50), new Coord(50,50));
		assertEquals(false, one.collides(two));
		assertEquals(false, two.collides(one));
	}
	
	@Test 
	public void collisionDetected() {
		Gameobj one = new Gameobj(new Coord(0,0), new Coord(50,50));
		Gameobj two = new Gameobj(new Coord(25,25), new Coord(50,50));
		assertEquals(true, one.collides(two));
		assertEquals(true, two.collides(one));
	}

}
