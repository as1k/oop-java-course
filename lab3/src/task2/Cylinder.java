package task2;

class Cylinder extends Shapes {
	public double height;
    public double radius;
    
    public Cylinder (double height, double radius){
    	super(radius);
        this.height = height;
    }
    
    public double volume(){
        return radius*radius*height;
    }
    public double surfaceArea(){
        return radius*radius;
    }
    
	public String toString() {
		return "Cylinder's volume = " + volume() + ", Cylinder's surface Area = " + surfaceArea() +".";
	}
}