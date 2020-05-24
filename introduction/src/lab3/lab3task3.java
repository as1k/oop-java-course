package lab3;

import java.util.Date;

public class lab3task3 {

	public static void main(String[] args) throws CloneNotSupportedException  {
		Employee e = new Employee("Samuel Umtiti", "0015", 250000, new Date());
		Employee q = (Employee) e.clone();
		System.out.println(q);
	}	
}

class Person{
	public String name;
	public String id;
	    
	public Person(String name, String id){
		this.name = name;
		this.id = id;
	}	        
	
	public boolean equals(Person p){
	return p.name==name && p.id==id;
	}
	
	public String toString() {
	return name + " " + id;
	}
}

class Employee extends Person implements Comparable, Cloneable{
    public double salary;
    public Date hireDate;;

    public Employee(String name, String id, double salary, Date hireDate) {
        super(name, id);
        this.salary = salary;
        this.hireDate = hireDate;
    }
    
    public boolean equals(Employee p){
    	return  p.salary == salary && super.equals(p) && p.hireDate == hireDate;
    	}
     
    @Override 
    public String toString() {
    	return super.toString() + ", salary: " + salary + ", hire date: " + hireDate + ".";
        }

	@Override
	public int compareTo(Object o) {
		Employee e = (Employee) o;
		if(salary > e.salary){
			return 1;
		}else if(salary < e.salary){
			return -1;
		}else {
			return 0;
		}
	}
	@Override
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
		
	}
}

class Manager extends Employee implements Comparable, Cloneable{
	public int bonus;
    public Employee[] team;
	public Date hireDate;
    
	public Manager(String name, String id, double salary, Date hireDate, int bonus, Employee[] team) {
		super(name, id, salary, hireDate);
		this.bonus = bonus;
		this.team = team;
	}

	 @Override 
     public boolean equals(Person p){
         Manager manager = (Manager)p;
         return super.equals(manager) && manager.bonus == bonus && manager.team == team;
     }
     
	 @Override 
     public String toString() {
         return super.toString() + "; bonus: " + bonus + "; employees: " + '\n' + employees();
     }
     public String employees() {
         String s = new String();
         for(int i=0; i<this.team.length; i++){
             s += this.team[i] + "\n";
         }
         return s;
     }

 	@Override
 	public int compareTo(Object a){
 		Manager m = (Manager) a;
 		if(salary > m.salary){
 			return 1;
 		}else if(salary < m.salary){
 			return -1;
 		}else if(bonus > m.bonus){
 			return 1;
 		} else if(bonus < m.bonus){
 			return -1;
 		} else return 0;
 	}
     @Override
     public Object clone() throws CloneNotSupportedException{
    	 return super.clone();	
 	}
}