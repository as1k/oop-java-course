package task3;

import java.util.Scanner;

class Analyzer {
	public Analyzer(){
		//empty
	}
	
	Data d = new Data();
	static double maximum;
	static double res = 0;
	{
		d.setCnt(0);
		while(true) {
			Scanner scanner = new Scanner(System.in);
			System.out.print("Enter number(Q to quit): ");
	        String input = scanner.nextLine();
	        d.setCnt(d.getCnt()+1);
	        
	        if ("q".equals(input)) {
	            System.out.println("Exit!");
	            break;
	        }
	        else if ("Q".equals(input)) {
	            System.out.println("Exit!");
	            break;
	        }
	        else {
	        	double num = Double.parseDouble(input);
				res += num;
				if(d.getCnt() == 1) {
	        		maximum = num;
	        	}
				if(num > maximum) maximum = num;
	        }
		}
	}	
	int count = d.getCnt()-1;
	
	public void AvgAndMax() {
		Data d = new Data();
		d.setAvg(res/count);
		d.setMax(maximum);
		System.out.println("Average is " + d.getAvg());
		System.out.println("Max is " + d.getMax());
	}
}
