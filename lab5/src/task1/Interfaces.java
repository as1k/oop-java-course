package task1;

interface Moveable{
	int speed = 2;
	void move(double x, double y);
}

interface JumpAndWalk extends Moveable{
	int speed = 1;
	int newSpeed = Moveable.speed + speed;
	void jumping(double x, double y);
}
interface FastWalk extends Moveable{
	int speed = 5;
	int newSpeed = Moveable.speed + speed;
	void running(double x, double y);
}