package lab2;

public class lab2task1 {

	public static void main(String[] args) {
		Cat c = new Cat("Musya", "gray", 15, 20, 50);
		c.Drink(50);
		c.Eat(60);
		c.Voice();
		System.out.println("Cat's health level = " + c.healthlvl + ", " 
							+"Weight= "+ c.weight + ", " 
							+"Height= "+ c.height + ".");
	}

}

class Animal{
	protected String name;
	protected String color;
	protected int weight;
	protected int height;
	protected int healthlvl;
	
	public Animal(String name, String color, int weight, int height, int healthlvl) {
		this.name = name;
		this.color = color;
		this.weight = weight;
		this.height = height;
		this.healthlvl = healthlvl;
	}
	
	protected void Drink(int waterlvl) {
		healthlvl += waterlvl;
	}
	protected void Eat(int meal) {
		height += meal;
		weight += meal;
	}
	protected void Voice() {
		System.out.print("Arrrr");
	}
	protected void Voice(String azalar) {
		System.out.println("Overloading is checked");
	}
}

class Cat extends Animal{
	
	public Cat(String name, String color, int weight, int height, int healthlvl) {
		super(name, color, weight, height, healthlvl);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Drink(int milk) {
		super.healthlvl += milk;
	}
	@Override
	public void Eat(int mouse) {
		super.height += mouse;
		super.weight += mouse;
	}
	@Override
	public void Voice() {
		super.Voice();
		System.out.println(" Myau");
	}
}