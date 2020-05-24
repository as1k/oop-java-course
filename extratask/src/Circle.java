import java.awt.Color;

class Circle extends Shape{
	  public double r;
	  public Circle(Color color, int x){
	    super(color, x);
	    
	  }
	  public void draw() {
		  for(int i = 0; i < x; i++) {
			  System.out.print(" ");
		  }
	    if(color == Color.BLACK) {
	      System.out.println("()");
	    } else {
	      System.err.println("()");
	    }
	  }
	  public double getLength(double r) {
	    return 2*Math.PI*r;
	  }
	}