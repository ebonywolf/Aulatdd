package game;

public class Gameobj {

	Coord position;
	Coord hitbox;
	Coord speedVector;
	
	public Gameobj(){
		position = new Coord(0,0);
		hitbox = new Coord(0,0);
		speedVector = new Coord(0,0);
	}
	public Gameobj(Coord pos, Coord hit){
		position = pos;
		hitbox = hit;
		speedVector = new Coord(0,0);
	}
	public void setHitBox(Coord hit) {
		hitbox = hit;
	}
	public void setSpeedVector(Coord c) {
		speedVector = c;
	}
	
	public Coord getPosition() {
		return position;
	}
	public Coord getHitbox() {
		return hitbox;
	}
	
	public void move() {
		position.add(speedVector);
	}
	public void move(Coord coord) {
		position.add(coord);	
	}
	public void moveto(int x, int y) {
		position.x=x;
		position.y=y;
		
	}
	public void moveto(Coord c) {
		position.att(c);
		
	}
	@Override
	public String toString() {
		
		return position.toString();
	}

	
	
}
