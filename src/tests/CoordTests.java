package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import game.Coord;

public class CoordTests {
	
	@Test
	public void getAngle45() {
		Coord c =new Coord(5,5);
		double angleDeg = c.getAngleDeg();
		assertEquals(45, (int)angleDeg);
		
	}
	@Test
	public void getAngle90() {
		Coord c =new Coord(0,5);
		double angleDeg = c.getAngleDeg();
		assertEquals(90, (int)angleDeg);
		
	}
	@Test
	public void getAngle0() {
		Coord c =new Coord(5,0);
		double angleDeg = c.getAngleDeg();
		assertEquals(0, (int)angleDeg);	
	}
	@Test
	public void getDistanceLine() {
		Coord a =new Coord(5,0);
		Coord b =new Coord(0,0);
		double dist = a.distance(b);
		assertEquals(5, (int)dist);	
	}
	@Test
	public void getDistanceSame() {
		Coord a =new Coord(0,0);
		Coord b =new Coord(0,0);
		double dist = a.distance(b);
		assertEquals(0, (int)dist);	
	}
	@Test
	public void getDistanceDiag() {
		Coord a =new Coord(3,4);
		Coord b =new Coord(0,0);
		double dist = a.distance(b);
		assertEquals(5, (int)dist);	
	}
	
	
}
