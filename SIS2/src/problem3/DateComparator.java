package problem3;

import java.util.Comparator;  

class DateComparator extends Person implements Comparator<Employee>{
	public int compare(Employee e1, Employee e2) {
		return e1.getHireDate().compareTo(e2.getHireDate());
	}
}
