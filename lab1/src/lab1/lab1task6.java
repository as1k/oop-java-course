package lab1;

import java.util.Scanner;

public class lab1task6 {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		String aString = new String();
		aString = s.nextLine();
		if(Polindrome(aString)) System.out.println("Polindrome");
		else System.out.println("Not Polindrome");
	}
	
	public static boolean Polindrome(String str) {
		for(int i = 0; i < str.length()/2; i++) {
			if(str.charAt(i) == str.charAt(str.length()-1)) 
				return true;
			i++;
		}
		return false;
	}
}
