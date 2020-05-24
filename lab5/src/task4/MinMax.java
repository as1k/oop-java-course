package task4;

class MinMax {
	static class Pair{
		private int first, second;
		public Pair(int f, int s) {
			first = f;
			second = s;
		}
		
		public int  getFirst() {
			return this.first;
		}
	    
		public int getSecond() {
			return this.second;
		}
		
		public String toString() {
			return "Max value is: " + getFirst() + "\n" + 
					"Min value is: " + getSecond() + ".";
		}
	}
	
	static Pair minMax(int[] a) {
		if (a.length == 0) return new Pair(0, 0);
		int min = a[0];
		int max = a[0];
		for (int i = 1; i < a.length; i++) {
			if (min > a[i]) min = a[i];
			if (max < a[i]) max = a[i];
		}
		Pair pair = new Pair(min, max);
		return pair;
	}
}