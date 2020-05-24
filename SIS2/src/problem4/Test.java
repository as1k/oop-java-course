package problem4;

class Test {

	public static void main(String[] args) {
		Chocolate[] t = {
				new Chocolate("asd", 42),	
				new Chocolate("asd", 22),
				new Chocolate("asd", 16),
				new Chocolate("asd", 79),
				new Chocolate("asd", 42)
			};
			
			Time[] t1 = {
					new Time(16, 45, 20),	
					new Time(12, 45, 10),
					new Time(8, 45, 40),
					new Time(16, 45, 20),
					new Time(8, 45, 40)
			};
			System.out.println(t[0].compareTo(t[4]) + "\n");
			Sort.bubbleSort(t);
			Sort.bubbleSort(t1);
			
			for(int i = 0 ; i < t.length; i++) {
				System.out.println(t1[i].toUniversal());
			}
			System.out.println();
			for(int i = 0 ; i < t1.length; i++) {
				System.out.println(t[i].toString());
			}
	}
}