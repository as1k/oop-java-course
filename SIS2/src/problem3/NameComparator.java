package problem3;

import java.util.Comparator;

class NameComparator extends Person implements Comparator<Employee>{
	public int compare(Employee e1, Employee e2) {
		return e1.getName().compareTo(e1.getName());
	}
}