package task2;

import java.io.Serializable;
import java.util.Objects;

class Instructor implements Serializable {
    private String firstName;
    private String lastName;
    private String department;
    private String email;
    
    public Instructor(String firstName, String lastName, String department, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.email = email;
    }
    
    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getDepartment() {
        return this.department;
    }

    public String getEmail() {
        return this.email;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString() {
        return firstName + " " + lastName + "; " + "Department: " + department + "; " + " Email: " + email;
    }

    public boolean equals(Object o) {
    	if(o == this) return true;
    	if(!(o instanceof Instructor)) return false;
    	if(o == null || o.getClass() != this.getClass()) return false;
    	Instructor other = (Instructor) o;
    	return other.department.equals(this.department) && other.email.equals(this.email) && 
    			other.firstName.equals(this.firstName) && other.lastName.equals(this.lastName);
    }
    
    public int hashCode() {
    	return Objects.hash(firstName, lastName, email, department);
    }
}
