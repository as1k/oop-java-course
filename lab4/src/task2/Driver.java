package task2;

import java.io.*;
import java.time.LocalDateTime;
import java.util.Vector;

class Driver implements Serializable{

	public static void main(String[] args) throws IOException, ClassNotFoundException{
        Vector<Course> courses = new Vector<Course>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader adminreader = new BufferedReader(new FileReader("C:\\Users\\User\\eclipse-workspace\\lab4\\src\\task2\\admin.txt"));
        BufferedWriter adminwriter = new BufferedWriter(new FileWriter("C:\\Users\\User\\eclipse-workspace\\lab4\\src\\task2\\admin.txt", true));
        adminwriter.newLine();
        System.out.println("Username:");
        String username = reader.readLine();
        System.out.println("Password:");
        String password = reader.readLine();
        String line;
        boolean checker_username = false;
        boolean checker_password = false;

        int counter = 0;
        while ((line = adminreader.readLine()) != null) {
            StringBuilder d = new StringBuilder();
            if (counter == 2) {
                break;
            }
            for (int i = 10; i < line.length(); i++)
                d.append(line.charAt(i));

            if (counter == 0 && d.toString().equals(username))
                checker_username = true;

            if (counter == 1 && d.toString().equals(password)) {
                checker_password = true;
            }
            counter++;
        }
        assert(checker_password && checker_username);

        if (checker_username && checker_password) {
            while (true) {
                adminwriter.write(LocalDateTime.now().toString() + " admin logged in to a system");
                adminwriter.newLine();
                System.out.println("CourseTitle:");
                String courseTitle = reader.readLine();
                if (courseTitle.equals("0")) {
                    break;
                }
                adminwriter.write(LocalDateTime.now().toString() + " admin added new course - " + courseTitle);
                adminwriter.newLine();
                System.out.println("TextbookTitle:");
                String textbook_title = reader.readLine();
                System.out.println("Author of textbook:");
                String authorOfTextbook = reader.readLine();
                System.out.println("Isbn of textbook:");
                String isbnOfTextbook = reader.readLine();
                Textbook textbook = new Textbook(textbook_title, authorOfTextbook, isbnOfTextbook);
                adminwriter.write(LocalDateTime.now().toString() + " admin added textbook -" + textbook_title + " to course " + courseTitle);
                adminwriter.newLine();
                System.out.println("Instructor FirstName:");
                String firstName = reader.readLine();
                System.out.println("LastName:");
                String lastName = reader.readLine();
                System.out.println("Department:");
                String department = reader.readLine();
                System.out.println("Email:");
                String email = reader.readLine();
                Instructor instructor = new Instructor(firstName, lastName, department, email);
                adminwriter.write(LocalDateTime.now().toString() + " admin added instructor - " + firstName + " to course " + courseTitle);
                adminwriter.newLine();
                Course course = new Course(courseTitle, instructor, textbook);
                courses.add(course);
                //
                FileOutputStream fos = new FileOutputStream("C:\\Users\\User\\eclipse-workspace\\lab4\\src\\task2\\courseout.txt");
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                oos.writeObject(courses);
                oos.flush();
                oos.close();
            }
        }else{
        	FileInputStream fis = new FileInputStream("C:\\Users\\User\\eclipse-workspace\\lab4\\src\\task2\\courseout.txt");
    		ObjectInputStream ois = new ObjectInputStream(fis);
    		Vector<Course> b = (Vector<Course>) ois.readObject();
    		for(int i = 0; i < b.size(); i++) {
        		System.out.println(b.get(i) + " ");
    		}
        }
        reader.close();
        adminreader.close();
        adminwriter.close();
    }
}
