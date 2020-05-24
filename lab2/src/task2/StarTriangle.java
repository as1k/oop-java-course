package task2;

class StarTriangle {
	public static int width;
	String s = new String("");
	
	public StarTriangle(int width) {
		this.width = width;
	}

	public String toString() {
		for(int i = 0; i < width; i++) {
			for(int j = 0; j <= i; j++) {
				s = s + "[*]";
			} s = s + "\n";
		}
		return s;
	}
}
