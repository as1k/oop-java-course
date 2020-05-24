package task1;

class Temperature {
	private double value;
	private char mainscale;
	
	public Temperature(double value) {
		this.value = value;
		this.mainscale = 'C';	
	}
	
	public Temperature(char mainscale) {
		this.mainscale = mainscale;
		this.value = 0;
	}
	public Temperature(double value, char mainscale) {
		this.value = value;
		this.mainscale = mainscale;
	}
	
	public Temperature(){
		this.value = 0;
		this.mainscale = 'C';
	}
	
	//Set_functions
	public void setValue(double value) {
		this.value = value;
	}
	public void setScale(char mainscale) {
		this.mainscale = mainscale;
	}
	public void setBoth(double value, char mainscale) {
		this.value = value;
		this.mainscale = mainscale;
	}
	
	//Get_functions
	public double getValue() {
		return this.value;
	}
	public char getScale() {
		return this.mainscale;
	}
	
	//methods
	public double toCelsius(double value) {
		if(mainscale == 'C') {return value;}
		double newvalue = (5 * (value - 32)) / 9;	
		this.mainscale = 'C';
		return newvalue;
	}
	public double toFahrenheit(double value) {
		if(mainscale == 'F') { return value;}
		double newvalue =  (9*(value / 5)) + 32;
		this.mainscale = 'F';
		return newvalue;
	}
}