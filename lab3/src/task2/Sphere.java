package task2;

class Sphere extends Shapes{
    
    public Sphere(double radius){
    	super(radius);
    }
    
	public double volume() {
		return radius*radius*radius*(Math.PI*(4/3));
	}
	public double surfaceArea() {
        return radius*radius*Math.PI;
	}
	public String toString() {
		return "Sphere's volume = " + volume() + ", Sphere's surface Area = " + surfaceArea() +".";
	}
}