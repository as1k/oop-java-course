package task3;

import java.util.Objects;

class Manager extends Employee{
	public int bonus;
    public Employee[] team;
    
	public Manager(String name, String id, double salary, int year, String insuranceNumber, int bonus, Employee[] team) {
		super(name, id, salary, year, insuranceNumber);
		this.bonus = bonus;
		this.team = team;
	}
	
    public String employees() {
        String s = new String();
        for(int i=0; i<this.team.length; i++){
            s += this.team[i] + "\n";
        }
        return s;
    }
    
	public boolean equals(Object o){
		if (o == this) { 
            return true; 
        } 
        if (!(o instanceof Manager)) { 
            return false; 
        }
        
      Manager a = (Manager) o; 
      return (this.name.equals(a.name))
              && (this.id.equals(a.id))
              && (this.getSalary() == a.getSalary())
              && (this.getYear() == a.getYear())
              && (this.getInsuranceNumber().equals(a.getInsuranceNumber()))
              && (this.bonus == a.bonus)
              && (this.team.equals(team));
	}
	public int hashCode() {
        return Objects.hash(name, id, getSalary(), getYear(), getInsuranceNumber(), bonus, team);
    }
     public String toString() {
         return super.toString() + "; bonus: " + bonus + "; employees: " + '\n' + employees();
     }
}