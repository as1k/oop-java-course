package task1;

class Cat extends Animal{
	private int tailLength;
	private int mealLvl;
	
	public Cat(String name, String color, int weight, int tailLength) {
		super(name, color, weight);
		this.tailLength = tailLength;
	}

	public void Drink() {
		System.out.println("Cat drinks milk!");
	}
	public void Drink(String anotherDrink) {
		System.out.println("Cat sometimes drinks " + anotherDrink);
	}

	public void Eat() {
		System.out.println("Cat eats only Whiskas!");
	}
	
	public void Voice() {
		System.out.println("Myaau");
	}
}