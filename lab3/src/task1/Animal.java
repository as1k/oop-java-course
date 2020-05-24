package task1;

abstract class Animal{
	private String name;
	private String color;
	private double weight;
	
	public Animal(String name, String color, double weight) {
		this.name = name;
		this.color = color;
		this.weight = weight;
	}
	
	//Methods
	public void Drink() {
		System.out.println("Unknown");
	}
	
	public void Voice() {
		System.out.println("Unknown");
	}
}