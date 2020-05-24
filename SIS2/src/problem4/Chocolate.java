package problem4;

public class Chocolate implements Comparable{

	private String name;
	private double weight;
	
	public Chocolate(String name, double weight) {
		this.name = name;
		this.weight = weight;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public String getName() {
		return name;
	}
	public double getWeight() {
		return weight;
	}
	public int compareTo(Object obj) {
		Chocolate temp = (Chocolate)obj;
		if(this.weight > temp.weight) return 1;
		else if(this.weight == temp.weight) return 0;
		else return -1;
	}
	
	
	
	public String toString() {
		return "Name: " + name +
				"\nWeight: " + weight + "\n";
	}
	public boolean equals(Object obj) {
		if(obj == null) return false;
		if(!(obj instanceof Chocolate)) return false;
		Chocolate tmp = (Chocolate)obj;
		return (this.name == tmp.name && this.weight == tmp.weight);
	}
}