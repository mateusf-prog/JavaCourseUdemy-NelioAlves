package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Peoples;

public class ProgramEx8 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int res, age, majority, highPosition;
        String name;

        System.out.print("How many peoples will you type? ");
        res  = sc.nextInt();
        System.out.println();

        Peoples[] vect = new Peoples[res];

        for (int i=0; i<res; i++) {
            System.out.println("Person data: ");
            System.out.print("Name: ");
            name = sc.next();
            System.out.print("Age: ");
            age = sc.nextInt();
            vect[i] = new Peoples(name, age);
        }

        majority = vect[0].getAge();
        highPosition = 0;
        
        for (int i=1;i<res;i++) {
            if (vect[i].getAge() > majority) {
                majority = vect[i].getAge();
                highPosition = i;
            }
        }

        System.out.println("Oldest person: " + vect[highPosition].getAge() );

        sc.close();
    }
}
