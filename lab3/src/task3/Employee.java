package task3;

import java.util.Objects;

class Employee extends Person {
    private double salary;
    private int year;
    private String insuranceNumber;

    public Employee(String name, String id, double salary, int year, String insuranceNumber) {
        super(name, id);
        this.setSalary(salary);
        this.setYear(year);
        this.setInsuranceNumber(insuranceNumber);
    }
    
	public boolean equals(Object o){
		if (o == this) { 
            return true; 
        } 
        if (!(o instanceof Employee)) { 
            return false; 
        }
        
      Employee a = (Employee) o; 
      return (super.name.equals(a.name))
              && (super.id.equals(a.id))
              && (this.getSalary() == a.getSalary())
              && (this.getYear() == a.getYear())
              && (this.getInsuranceNumber().equals(a.getInsuranceNumber()));
	}
    public int hashCode() {
        return Objects.hash(name, id, salary, year, insuranceNumber);
    }
	
    public String toString() {
    	return super.toString() + ", salary: " + getSalary() + ", year: " + getYear() + ".";
        }

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getInsuranceNumber() {
		return insuranceNumber;
	}

	public void setInsuranceNumber(String insuranceNumber) {
		this.insuranceNumber = insuranceNumber;
	}
}