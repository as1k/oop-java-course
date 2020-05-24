package task5;

class Gym {
	Actions actions;
	final double g = 9.8;
	private static double mass;
	private double weight;
	public static double height;
	private int day_cnt;
	public static int muscle_lvl;
	private static int nextDay = 1;
	
	public Gym() {
		day_cnt = nextDay++;
	}

	{//initialization block 
		System.out.println("Full information about man is provided below: ");
	}
	
	public Gym(int muscle_lvl, Actions actions) {
		this();
		Gym.muscle_lvl = muscle_lvl;
		this.actions = actions;
	}
	
	public static double getMass() {
		return mass;
	}
	public static void setMass(double mass) {
		Gym.mass = mass;
	}
	
	public void setWeight(double mass) {
		Gym.setMass(mass);
		this.weight = Gym.mass * g;
	}
	public void setWeight(Actions act) {
		if(act == Actions.EATING) this.weight += 2;
		if(act == Actions.SLEEPING) this.weight +=4;
	}
	public double getWeight() {
		return weight;
	}
	public void getDay_cnt() {
		System.out.println("Training day ¹ " + day_cnt);
	}
	public void Motion() {
		if(actions == Actions.RUNNING) {weight--; muscle_lvl+=3;}
		if(actions == Actions.SWIMMING) {weight--; height++; muscle_lvl+=2;}
		if(actions == Actions.JUMPING) { weight--; height+=2; muscle_lvl+=1;}
		if(actions == Actions.PULLING_UP) {muscle_lvl += 5;}
		}
}
