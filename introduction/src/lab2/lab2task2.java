package lab2;

public class lab2task2 {
	public static void main(String[] args) {
		Cylinder cylinder = new Cylinder(2, 3);
		Sphere sphere = new Sphere(4);
        Cube cube = new Cube(5);
        System.out.println("Cylinder volume = " + cylinder.volume() + ",  " + 
							"Cylinder area = " + cylinder.surfaceArea());
        System.out.println("Sphere volume = " + sphere.volume() + ",  " + 
        					"Sphere area = " + sphere.surfaceArea());
        System.out.println("Cube volume = " + cube.volume() + ",  " + 
							"Cube area = " + cube.surfaceArea());
	}
}

abstract class AbstractClass{
	public abstract double volume();
	public abstract double surfaceArea();
}

class Cylinder extends AbstractClass {
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

class Sphere extends AbstractClass{
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

class Cube extends AbstractClass{
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