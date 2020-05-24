package lab1;

import java.util.Vector;
  
public class classobjects {

	public static void main(String[] args) {
		int x = 10;
		String st = new String("bmw");
		Car bmw = new Car(st, "black", x, 150);
		System.out.println("Name: " + bmw.name);
		bmw.name = "X5";
		System.out.println("Name: " + bmw.name);
		bmw.setSpeed(150);
		int speed = bmw.getSpeed();
		System.out.println("Speed: " + speed);
	}
}

class Car {
	
	public String name;
	public String color;
	private int price;
	private int speed;
	
	
	public Car() {
		this.name = "";
		this.speed = 0;
		this.color = "";
		this.price = 0;		
	}
	
	public Car(String name, String color, int price) {
		this();
		this.name = name;
		this.color = color;
		this.price = price;
	}
	
	public Car(String name, String color, int price, int speed) {
		this.name = name;
		this.speed = speed;
		this.color = color;
		this.price = price;
	}
	
	public int getSpeed() {
		return this.speed;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
}