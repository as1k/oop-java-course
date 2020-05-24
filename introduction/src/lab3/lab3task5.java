package lab3;

public class lab3task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {0, 8 , -3, 20};
		MinMax b = new MinMax(a);
		b.findMinAndMax();
	}

}

class MinMax {
	int[] a;
	long max = -100000;
	long min = 100000;
	
	public MinMax(int[] a) {
		this.a = a;
	}
	
	public void findMinAndMax() {
		for(int i = 0; i < a.length; i++) {
			if(min > a[i]) {min = a[i];}
		}
		for(int i = 0; i < a.length; i++) {
			if(max < a[i]) {max = a[i];}
		}
		
		System.out.println("MAX = " + max);
		System.out.println("MIN = " + min);
	}
}