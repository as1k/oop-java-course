package lab1;

import java.util.Scanner;

public class lab1task4 {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		double a = s.nextDouble();
		double b = s.nextDouble();
		double c = s.nextDouble();
		
		RootsOfQE(a,b,c);
	}
	
	public static void RootsOfQE(double a, double b, double c) {
		double x1, x2;
		double D = (b*b)-(4*a*c);
		if(D > 0) {
			x1 = (-b + Math.sqrt(D))/(2*a);
			x2 = (-b - Math.sqrt(D))/(2*a);
			System.out.println("x1 = " + x1);
			System.out.println("x2 = " + x2);
		}
		else if(D == 0) {
			x1 = (-b)/(2*a);
			System.out.println("x1 = " + x1);
		}
		else System.out.println("Error!");
	}
}
