package task3;

import java.util.Objects;

class Person{
	public String name;
	public String id;
	    
	public Person(String name, String id){
		this.name = name;
		this.id = id;
	}	        
	
	public boolean equals(Object p){
		if (p == this) { 
            return true; 
        } 
        if (!(p instanceof Person)) { 
            return false; 
        } 
        
      Person a = (Person) p; 
      return (this.name.equals(a.name))
              && (this.id.equals(a.id)); 
	}
	
	public int hashCode() {
        return Objects.hash(name, id);
    }

	public String toString() {
	return name + " " + id;
	}
	
}