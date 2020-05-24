package task1;

import java.io.*;
import java.util.Scanner;

import static java.lang.Integer.max;
import static java.lang.Integer.min;

class SecondProgram {

	public static void main(String[] args) {
		try {
            FileReader fr = new FileReader("C:\\Users\\User\\eclipse-workspace\\lab4\\src\\task1\\scores.txt");
            FileWriter fw = new FileWriter("C:\\Users\\User\\eclipse-workspace\\lab4\\src\\task1\\grades.txt", true);
            BufferedReader br = new BufferedReader(fr);
            BufferedWriter bw = new BufferedWriter(fw);
            String line = br.readLine();
            int sum = 0;
            int numberOfStudents = 0;
            int max = 0;
            int min = (int) 1e9;
            while (line != null) {
                Scanner sc = new Scanner(line);
                String firstname = sc.next();
                String lastname = sc.next();
                int score = sc.nextInt();

                sum += score;
                numberOfStudents++;
                max = max(max, score);
                min = min(min, score);

                line = br.readLine();
                sc.close();
            }
            double average = sum * 1.0/ numberOfStudents;
            bw.write("Average - " + average);
            bw.newLine();
            bw.write("Maximum - " + max);
            bw.newLine();
            bw.write("Minimum = " + min);
            bw.newLine();
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
