package lab1;
import java.util.Scanner;

public class lab1task2 {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		int a = s.nextInt();
		Math(a);
	}
	public static void Math(int a) {
		int area = a*a;
		int perimeter = a*4;
		double diagonal = a*Math.sqrt(2);
		System.out.println(area);
		System.out.println(perimeter);
		System.out.println(diagonal);
	}
}

