package task5;

class Problem {

	public static void main(String[] args) {
		Gym man = new Gym(10, Actions.RUNNING);
		
		man.getDay_cnt();
		man.setWeight(7.5);
		System.out.println("First Weight " + man.getWeight());
		man.setWeight(Actions.EATING);
		System.out.println("Second Weight " + man.getWeight());
		
		man.Motion();
		System.out.println("Third Weight " + man.getWeight());
		System.out.println("Muscle Level " + Gym.muscle_lvl);
		Gym girl = new Gym(12, Actions.PULLING_UP);
		girl.getDay_cnt();
	}

}
