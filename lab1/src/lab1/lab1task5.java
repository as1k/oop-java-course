package lab1;

import java.util.Scanner;

public class lab1task5 {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		int b = s.nextInt();
		int p = s.nextInt();
		PrintAccInfo(b, p);
	}

	public static void PrintAccInfo(int balance, int procent) {
		
		int newBalance = balance + ((balance * procent) / 100);
		System.out.println("New Balance is " + newBalance);
	}
}
