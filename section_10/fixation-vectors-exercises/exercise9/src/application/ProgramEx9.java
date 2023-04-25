package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Student;

public class ProgramEx9 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String name;
        int res;
        double note1, note2;

        System.out.print("How many Students will be entered? ");
        res = sc.nextInt();

        Student student;
        Student[] vect = new Student[res];

        for (int i=0; i<res; i++) {
            System.out.println("Enter the name, grade 1 and grade 2 of the student: ");
            name = sc.next();
            note1 = sc.nextDouble();
            note2 = sc.nextDouble();
            student = new Student(name, note1, note2);
            vect[i] = student;
        }

        System.out.println("Approved students: ");
        for (int i=0;i<res; i++) {
            if ((vect[i].getNote1() + vect[i].getNote2()) >= 12.0) {
                System.out.println(vect[i].getName());
            }
        }

        sc.close();
    }    
}
