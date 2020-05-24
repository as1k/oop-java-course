import java.awt.Color;

class Rectangle extends Shape{
	  public double a;
	  public Rectangle (Color color, int x){
	    super(color, x);
	  }
	  public void draw() {
		  for(int i = 0; i < x; i++) {
			  System.out.println(" ");
		  }
	    if(color == Color.BLACK) {
	      System.out.println("[=]");
	    } else {
	      System.err.println("[=]");
	    }
	  }
	  public double getArea(double a) {
	    return a*a;
	  }
	}