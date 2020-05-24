package lab1;

public class lab1task1 {
	public static void main(String[] args) {
		PrintMyName();
	}
	
	public static void PrintMyName() {
		String str = new String("Assylanbek Nurmukhambet");
		System.out.print('+');
		for(int i = 0; i < str.length(); i++) {
			System.out.print('-');
		}
		System.out.print('+');
		System.out.print("\n|");
		System.out.print(str);
		System.out.print('|');
		System.out.print("\n+");
		for(int i = 0; i < str.length(); i++) {
			System.out.print('-');
		}
		System.out.print('+');
	}
}