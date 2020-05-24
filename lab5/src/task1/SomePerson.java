package task1;

class SomePerson implements JumpAndWalk, FastWalk {
	private double x, y;
	
	public double getX() {
	    return this.x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return this.y;
	}
	public void setY(double y) {
		this.y = y;
	}
	  
	public void speedInfo() {
		System.out.println("Fast walking man's speed is " + FastWalk.newSpeed);
		System.out.println("Slowly walking man's speed is " + JumpAndWalk.newSpeed);
	}
	public void jumping(double x, double y) {
		x += 2;
		y += 1;
		System.out.println("New Position is: " + x + ", " + y);
	}
	
	public void running(double x, double y) {
		x += x*3;
		y += y*3;		
		System.out.println("New Position is: " + x + ", " + y);
	}

	public void move(double x, double y) {
		this.x += x;
	    this.y += y;
		System.out.println("New Position is: " + x + ", " + y);
	}
}