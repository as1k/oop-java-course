package task3;

class Data {
	private double avg;
	private double max;
	private int cnt;
	
	public Data(){
		
	} //empty constructor 
	
	//Setgpa
	public void setAvg(double avg) {
		this.avg = avg;
	}
	public void setMax(double max) {
		this.max = max;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	//Getgpa
	public double getAvg() {
		if(Analyzer.res == 0) {
			return 0;
		}
		return avg;
	}
	public double getMax() {
		if(Analyzer.maximum == 0) {
			return 0;
		}
		return max;
	}
	public int getCnt(){
		return cnt;
	}
}
