package task1;

import java.io.*;
import java.util.Scanner;
import java.util.Vector;
import static java.lang.Integer.max;


class FirstProgram {
	
	public static void main(String[] args) {
		try {
            FileReader fr = new FileReader("C:\\Users\\User\\eclipse-workspace\\lab4\\src\\task1\\scores.txt");
            FileWriter fw = new FileWriter("C:\\Users\\User\\eclipse-workspace\\lab4\\src\\task1\\grades.txt");
            BufferedReader br = new BufferedReader(fr);
            BufferedWriter bw = new BufferedWriter(fw);
            String line = br.readLine();
            Vector<Student> students = new Vector<>();
            while (line != null) {
                /*Scanner sc = new Scanner(line);
                String firstname = sc.next();
                String lastname = sc.next();
                int score = sc.nextInt();
                */
            	String[] data = line.split(" ");
                String firstname = data[0];
                String lastname = data[1];
                String scoreStr = data[2];
                int score =Integer.parseInt(scoreStr);
                
                Student student = new Student(firstname + " " + lastname, score);
                students.add(student);

                line = br.readLine();
                //sc.close();
            }
            int maxScore = 0;
            for (Student student : students) {
            	maxScore = max(maxScore, student.getScore());
            }
            for (Student student : students) {
                bw.write(student.name + " - " + "\"" + student.getMark(maxScore) + "\"");
                bw.newLine();
            }
            br.close();
            fr.close();
            bw.close();
            fw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
}
