package task4;

class Problem {

	public static void main(String[] args) {	
		Time t = new Time(12,50,30);
		Time t2 = new Time(15,11,40);
		t.add(t2);
		System.out.println("Universal: " + t.toUniversal()); //prints"23:05:06"
		System.out.println("Standard: " + t.toStandard());  //prints"11:05:06 PM"
	}
}
