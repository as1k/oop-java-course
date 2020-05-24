package task2;

abstract class Shapes{
	public double radius;
	
	public abstract double volume();
	public abstract double surfaceArea();
	
	public Shapes(double radius){
		this.radius = radius;
	}
}