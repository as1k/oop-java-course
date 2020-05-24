package task3;

import java.util.HashSet;

class Problem {

	public static void main(String[] args) {
		Employee[] team = {
		          new Employee("Ozil", "10", 390000, 2018, "18BD110825"),  
		          new Employee("Aubameyang", "14", 190000, 2018, "18BD0022123"),
		          new Employee("Lacazette", "09", 140000, 2018, "18BD777776"),
		          new Employee("Mkhitaryan", "07", 200000, 2018, "18BD00223112") 
		        };
		Manager manager = new Manager("Unai Emery", "0001", 200500, 2018,"18BD1123122", 5, team);
		System.out.println(manager.toString());
		
		// equals test
		Employee e = new Employee("Ozil", "10", 390000, 2018, "18BD110825");
		if(team[0].equals(e)) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		
		HashSet<Employee> empsHashSet = new HashSet<Employee>();
		for(int i = 0; i < team.length; i++) {
		empsHashSet.add(team[i]);
		}
		
		System.out.println(empsHashSet);
	}
}
