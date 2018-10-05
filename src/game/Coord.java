package game;

public class Coord {
	public Coord(double i, double j) {
		x = i;
		y = j;
	}
	public Coord(Coord c) {
		x = c.x;
		y = c.y;
	}
	public double x,y;


	public void att(Coord c) {
	
		x = c.x;
		y = c.y;
	}

	@Override
	public boolean equals(Object obj) {
		Coord other = (Coord) obj;
		return this.x == other.x && this.y == other.y;

	}

	@Override
	public String toString() {

		return "X:" + Double.toString(x) + " Y:" + Double.toString(y);
	}

	public void add(Coord coord) {
		x += coord.x;
		y += coord.y;

	}

	public double getAngle() {
		return Math.atan(y / x);
	}

	public double getAngleDeg() {

		return getAngle() * 180.0 / Math.PI;
	}

	public double distance(Coord b) {
		double t = b.x - this.x;
		double u = b.y - this.y;
		t *= t;
		u *= u;
		return Math.sqrt(t + u);
	}

}
