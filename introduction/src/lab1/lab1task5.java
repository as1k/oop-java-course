package lab1;

import java.util.Scanner;

public class lab1task5 {

	public static void main(String[] args) {
		func();
	}
	
	public static void func() {
		Scanner S = new Scanner( System.in );
		System.out.print( "length: " );
		int n = S.nextInt();
		System.out.print( "array: " );
		Scanner SS = new Scanner( System.in);
		String line = SS.nextLine();
		String[] ss = line.split(" ");
		int[] arr = new int[n];
		int[] arr2 = new int[n*2];
		
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(ss[i]);
			arr2[i*2] = arr2[i*2+1] = arr[i];
		}
		System.out.print( "new array: " );
		for(int i = 0; i < n*2; i++) {
			System.out.print(arr2[i] + " ");
		}
	}
}