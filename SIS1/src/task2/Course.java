package task2;

import java.util.Vector;

class Course {
	private String name;
	private String description;
	private int numberOfCredits;
	private Vector<String> prerequsite = new Vector<String>();
	
	public String getCourseName() {
		return this.name;
	}
	
	public Course(String name, String description, int numberOfCredits, Vector<String> prerequsite) {
		this.name = name;
		this.description = description;
		this.numberOfCredits = numberOfCredits;
		this.prerequsite = prerequsite;
	}
	
    public String toString(){
        return "The course name is " + name + ", description is " + description + ", number of credits is equal to " + numberOfCredits +
        		", the prerequsites are " + prerequsite;
    }
}
