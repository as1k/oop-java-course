package task2;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Vector<Manager> managers = new Vector<Manager>();
		Vector<Employee> emp = new Vector<Employee>();
		Date date = new Date();
		managers.add(new Manager("a", 25, "4560d", date, 158.3, emp, 69.3));
		managers.add(new Manager("a", 25, "4560d", date, 298, emp, 25.2)); // -1
		managers.add(new Manager("a", 25, "4560d", date, 158.3, emp, 88)); // 1
		managers.add(new Manager("a", 25, "4560d", date, 158.3, emp, 69.3)); // 0
		System.out.println(managers.get(0).compareTo(managers.get(3)));
	}
}