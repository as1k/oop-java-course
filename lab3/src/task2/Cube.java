package task2;

class Cube extends Shapes{
	//radius eto length;
	
	public Cube(double radius) {
		super(radius);
	}
	
	public double volume() {
        return radius*radius*radius;
	}
	public double surfaceArea() {
        return radius*radius;
	}
	public String toString() {
		return "Cube's volume = " + volume() + ", Cube's surface Area = " + surfaceArea() +".";
	}
}
