package task1;

public class Problem {

	public static void main(String[] args) {
		Temperature t = new Temperature(350, 'F');
		System.out.println(t.getValue() + " " + t.getScale());
		t.setBoth(200,'C');
		System.out.println(t.getValue() + " " + t.getScale());
		System.out.println(t.toFahrenheit(t.getValue()) + " " + t.getScale());
	}
}