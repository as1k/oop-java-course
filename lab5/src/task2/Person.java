package task2;

import java.util.Objects;

public class Person{
	private String name;
	private int age;
	public Person() {
		
	}
	public Person(String name) {
		this.name = name;
	}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
		}
	public int getAge() {
		return this.age;
		}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean equals(Object o) {
		if (o == this) return true;
		if (!(o instanceof Employee)) return false;
		Person p = (Person) o;
		return p.name.equals(name) && p.age == age;
	}
	public int hashCode() {
		return Objects.hash(name, age);
	}
}