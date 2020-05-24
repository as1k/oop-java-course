package task2;

public class Student {
	public String name;
	public String id;
	public int year;
	
	public Student(String name, String id){
		this.name = name;
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getName(){
		return this.name;
	}
	public String getId() {
		return this.id;
	}
	public int getYear() {
		return this.year;
	}
	
	public void incr(){
		year++;
		System.out.println("Year of study is: " + year);
	}
	
	public String toString() {
		return "Student name is " + name + ", ID is " + id + ", Year of study is " + year + ".";
	}
}
