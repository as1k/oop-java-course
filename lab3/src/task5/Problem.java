package task5;

import java.util.Scanner;
import java.util.Vector;

class Problem {
  public static void main(String[] args) {
    Vector<Person> people = new Vector<Person>();
    String name, address, school, program;
    double pay, fee;
    int year;
    while(true) {
    	
    System.out.println("Enter 1 to add new person or 2 to print info about all added people, q to stop");
    Scanner sc = new Scanner(System.in);
    String in = sc.nextLine();
    if ("q".equals(in)) {
    	System.out.println("Stopped!");
    	break;
    }
    if (in.equals("1")) {
      System.out.println("Who do you want to add: person or student or staff?");
      String input = sc.nextLine();
      if (input.equalsIgnoreCase("Staff")) {
        System.out.print("Enter the name: ");
        name = sc.nextLine();
        System.out.println("Enter the address: ");
        address = sc.nextLine();
        System.out.println("Enter the school: ");
        school = sc.nextLine();
        System.out.println("Enter pay: ");
        pay = sc.nextDouble();
        people.add(new Staff(name, address, school, pay));
      } else if (input.equalsIgnoreCase("Student")){
        System.out.print("Enter the name: ");
        name = sc.nextLine();
        System.out.println("Enter the address: ");
        address = sc.nextLine();
        System.out.println("Enter the program name: ");
        program = sc.nextLine();
        System.out.println("Enter the year of study: ");
        year = sc.nextInt();
        System.out.println("Enter the fee: ");
        fee = sc.nextDouble();
        people.add(new Student(name, address, program, year, fee));
      } else if (input.equalsIgnoreCase("person")) {
        System.out.print("Enter the name: ");
        name = sc.nextLine();
        System.out.println("Enter the address: ");
        address = sc.nextLine();
        people.add(new Person(name, address));
      }
      
      System.out.println("Person is successfully added!");
    }
    if (in.equals("2")) {
      for (int i = 0; i < people.size(); i++) {
        System.out.print(people.elementAt(i).toString());
        }
      }
    
    }
  }
}