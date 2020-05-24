package task2;

import java.util.*;

public class Manager extends Employee implements Comparable, Cloneable {
	private Vector<Employee> employees;
	private double bonus;
	public Manager() {
		super();
	}
	public Manager(String name, int age, String inum, Date hireDate, double salary, Vector<Employee> e, double bonus) {
		super(name, age, inum, hireDate, salary);
		employees = e;
		this.bonus = bonus;
	}
	public Manager(Vector<Employee> emp, double bonus) {
		employees = emp;
		this.bonus = bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	public double getBonus() {
	    return this.bonus;
	  }
	public void setEmployees(Vector<Employee> e) {
	    employees = e;
	  }
	public Vector<Employee> getEmployees(){
		return this.employees;
	}
	public boolean equals(Object o) {
		if (o == this) return true;
		if (!(o instanceof Employee)) return false;
		Manager m = (Manager) o;
		return m.employees.equals(employees) && m.bonus == bonus &&
	        m.getName().equals(getName()) && m.getAge() == getAge() &&
	        m.getInsuranceNumber().equals(getInsuranceNumber()) && 
	        m.getHireDate() == getHireDate();
	}
	public int hashCode() {
		return Objects.hash(getName(), getAge(), getInsuranceNumber(), getHireDate(), bonus, employees);
	}
	
	public int compareTo(Object other) {
		Manager m = (Manager)other;
	    if (m.getSalary() < getSalary()) return 1;
	    if (m.getSalary() > getSalary()) return -1;
	    if (m.getSalary() == getSalary()) {
	    	if (m.bonus < bonus) return -1;
	    	if (m.bonus > bonus) return 1;  
	    }
	    return 0;
	}
	
	public Manager clone() throws CloneNotSupportedException {
		Manager clone = (Manager)super.clone();
		super.clone();
		clone.bonus = this.bonus;
		return clone;
	}
}