package problem3;

import java.util.*;

public class Employee extends Person implements Comparable, Cloneable {
	private String insuranceNumber;
	private Date hireDate;
	private double salary;
	public Employee() {
		super();
	}

	public Employee(String name, int age, String insuranceNumber, Date date, double salary) {
		super(name, age);
		this.insuranceNumber = insuranceNumber;
	    this.salary = salary;
	    this.hireDate = date;
	}
	
	public void setInsuranceNumber(String insuranceNumber) {
		this.insuranceNumber = insuranceNumber;
	}
	
	public String getInsuranceNumber() {
		return this.insuranceNumber;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public double getSalary() {
		return this.salary;
	}
	
	public void setHiredate(Date date) {
		hireDate = date;
	}
	
	public Date getHireDate() {
		return this.hireDate;
	}
	
	public boolean equals(Object o) {
		if (o == this) return true;
		if (!(o instanceof Employee)) return false;
		Employee e = (Employee) o;
		return e.getName().equals(getName()) && e.getAge() == getAge() &&
				e.insuranceNumber.equals(insuranceNumber) && e.hireDate == hireDate;
	}
	
	public int hashCode() {
		return Objects.hash(getName(), getAge(), salary, insuranceNumber, hireDate);
	}
	
	public int compareTo(Object obj) {
		Employee temp = (Employee) obj;
		if (this.salary > temp.salary)
			return 1;
		else if(this.salary == temp.salary) return 0;
		return -1;
	}
	
	public Employee clone() throws CloneNotSupportedException {
		Employee clone = (Employee)super.clone();
		clone.hireDate = this.hireDate;
		clone.insuranceNumber = this.insuranceNumber;
		clone.salary = this.salary;
		return clone;
	}
}