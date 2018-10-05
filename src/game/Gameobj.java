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
		position = new Coord(pos);
		hitbox = new Coord(hit);
		speedVector = new Coord(0,0);
	}
	public Gameobj(Gameobj obj) {
		position = obj.position;
		hitbox = obj.hitbox;
		speedVector = obj.speedVector;
	}
	public boolean collides(Gameobj other) {
		Coord end = new Coord(position);
		end.add(hitbox);
		
		Coord otherend = new Coord(other.position);
		otherend.add( other.hitbox );
		
		return (this.position.x < otherend.x && end.x > other.position.x
				&& this.position.y < otherend.y && end.y > other.position.y);
		//java dos inferno, pqp
	}
	
	public void setHitBox(Coord hit) {
		hitbox.att(hit);
	}
	public void setSpeedVector(Coord c) {
		speedVector.att(c);
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
