package application;

import java.util.Locale;
import java.util.Scanner;

public class ProgramEx7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        
        int res, evenNumbers=0;
        double medium;

        System.out.print("How many elements will the vector have? ");
        res = sc.nextInt();

        int[] vect = new int[res];

        for (int i=0;i<res; i++) {
            System.out.print("Type a number: ");
            vect[i] = sc.nextInt();
        } 

        for (int i=0; i<res; i++) {
            if (vect[i] % 2 == 0) {
                evenNumbers += vect[i];
            }
        }

        medium = evenNumbers / vect.length;

        if (evenNumbers == 0.0) {
            System.out.println("None of even number!");
        } else {
            System.out.println("Medium of even numbers: " + medium);
        }

        sc.close();
    }
}
