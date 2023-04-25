package application;

import java.util.Locale;
import java.util.Scanner;
import entities.People;

public class ProgramEx2{
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many peoples will be entered? ");
        int res = sc.nextInt();
        System.out.println();
        
        People[] vect = new People[res];
        double avg=0.0, heightMedium;
        for (int i=0; i<res; i++) {
            System.out.print("Enter the person's data: \n");
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Age: ");
            int age = sc.nextInt();
            System.out.print("Height: ");
            double height = sc.nextDouble();

            // creating and storing people in the vector
            vect[i] = new People(name, age, height);
            avg += vect[i].getHeight();
        }

        int count=0;
        for (int i=0; i<res; i++) {
            if (vect[i].getAge() < 16) {
                count++;
            }
        }

        heightMedium = avg / res;
        count = (int) (((double)count / res ) * 100);

        System.out.printf("Medium height: %.2f%n", heightMedium);  
        System.out.printf("People under 16 years old: %d%%\n", count);
        for (int i=0; i<res; i++) {
            if (vect[i].getAge() < 16) {
                System.out.println(vect[i].getName());
            }
        }      
        sc.close();
    }
}