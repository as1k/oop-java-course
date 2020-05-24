package lab3;

public class lab3task4 {

	public static void main(String[] args) {
		Circle c = new Circle();
		c.setX(5);
		c.setY(4);
		c.move(15, 25);
		c.getX();
		c.getY();
		System.out.println(c.toString());
	}

}

interface Movable {
	  void setX(double x);

	  void setY(double y);

	  double getX();

	  double getY();

	  default void move(double deltaX, double deltaY) {
	    double newX = getX() + deltaX;
	    double newY = getY() + deltaY;
	    setX(newX);
	    setY(newY);
	  }
}
interface Shape {
	  void setX(double x);

	  void setY(double y);

	  double getX();

	  double getY();

	  void move(double deltaX, double deltaY);
}
class Circle implements Movable {
	  private double x;
	  private double y;

	  public Circle() {
	  }

	  public Circle(double x, double y) {
	    this.x = x;
	    this.y = y;
	  }

	  public void setX(double x) {
	    this.x = x;
	  }

	  public void setY(double y) {
	    this.y = y;
	  }

	  public double getX() {
	    return x;
	  }

	  public double getY() {
	    return y;
	  }

	  public String toString() {
	    return "Circle(" + x + ", " + y + ")";
	  }
	}