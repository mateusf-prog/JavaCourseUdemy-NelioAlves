package application;

import java.util.Scanner;
import java.util.Locale;

public class ProgramEx6{
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double medium=0.0;

        System.out.println("How many elements will the vector have? ");
        int res = sc.nextInt();

        double[] vect = new double[res];

        for (int i=0; i<res; i++) {
            System.out.print("Enter a number: ");
            vect[i] = sc.nextDouble();
            medium += vect[i];
        }

        medium = medium / res;

        System.out.printf("\nVector medium: %.3f%n", medium);
        System.out.println("Below average elements:");

        for (int i=0; i<res; i++) {
            if (vect[i] < medium) {
                System.out.printf("%.1f%n", vect[i]);
            }
        }
        
        sc.close();
    }
}