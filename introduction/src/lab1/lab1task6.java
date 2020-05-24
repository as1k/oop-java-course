package lab1;

import java.util.Scanner;

public class lab1task6 {
	public static void main(String[] args) {
		NumberInWords n = new NumberInWords();
        Scanner s = new Scanner (System.in);
        int a = s.nextInt();
        System.out.print(n.InWords(a));
	}
}

class NumberInWords{ // ot 0 do 9999
	protected String[] edinichnye = {"","one ","two ","three ","four ","five ",
			"six ","seven ","eight ","nine "};
	protected String[] dodvadcati = {"","eleven ","twelve ","thirteen ","fourteen ","fifteen ",
		     "sixteen ","seventeen ","eighteen ","nineteen "};
	protected String[] desyatichnye = {"","ten ","twenty ","thirty ","fourty ","fifty ",
		     "sixty ","seventy ","eighty ","ninety "};
	protected String[] myndar = {"hundred ","thousand ","hundreds ","thousands "};
	public String InWords(int a){
	    String s = new String();
	    int x = a/10000;
	    int z = (a - x*10000)/1000;
	    if(x!=1){
	     s+=desyatichnye[x];
	     s+=edinichnye[z];
	     } else {
	        s+=dodvadcati[z];
	    }
	    if (x==0 && z==1){
	        s+=myndar[1];
	    } else if (x!=0 || z!=0){
	       s+=myndar[3];
	    }
	    int y = ((a-x*10000)-z*1000)/100;
	    s += edinichnye[y];
	    if (y==1 && y!=0){
	        s+=myndar[0];
	    } else if (y!=0){
	        s+=myndar [2];
	    }
	    int w = (((a-x*100000)-z*1000)-y*100)/10;
	    int q = ((((a-x*100000)-z*1000)-y*100)-w*10);
	    if (w!=1){
	        s+=desyatichnye[w];
	        s+=edinichnye[q];
	    }   else {
	        s+=dodvadcati[q];
	    }
	    if(a==0){
	        s= "zero";
	    }
	    return s;
	    }
}