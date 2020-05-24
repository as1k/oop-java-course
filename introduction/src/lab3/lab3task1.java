package lab3;

public class lab3task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	       double radius = 4;
	       Sphere s = new Sphere(radius);
	       System.out.println(s.volume());
	}
}
interface Interface {
	public double volume();
	public double surfaceArea();
}
    
class Cylinder implements Interface {
	public double height;
    public double radius;
    
    public Cylinder (double height, double radius){
        this.height = height;
        this.radius = radius;
    }
    
    @Override 
    public double volume(){
        return radius*radius*height;
    }
    
    @Override 
    public double surfaceArea(){
        return radius*radius;
    }
}

class Sphere implements Interface{
	public double radius;
    
    public Sphere(double radius){
        this.radius = radius;
    }
    
	@Override
	public double volume() {
		// TODO Auto-generated method stub
		return radius*radius*radius*(Math.PI*(4/3));
	}

	@Override
	public double surfaceArea() {
		// TODO Auto-generated method stub
        return radius*radius*Math.PI;
	}
}

class Cube implements Interface{
	public double length;
	public Cube(double length) {
		this.length = length;
	}
	
	@Override
	public double volume() {
		// TODO Auto-generated method stub
        return length*length*length;
	}
	@Override
	public double surfaceArea() {
		// TODO Auto-generated method stub
        return length*length;
	}
}

class Point implements Interface {
    @Override
    public double volume(){
        return 0;
    }
    @Override
    public double surfaceArea(){
        return 0;
    }
}

// it's already done using abstract class