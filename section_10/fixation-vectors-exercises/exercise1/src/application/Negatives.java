package application;

import java.util.Scanner;
import java.util.Locale;

public class Negatives {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;

        System.out.print("How many numbers will you type? ");
        n = sc.nextInt();

        int[] vect = new int[n];

        // tranversing the vector and storing the numbers
        for (int i=0; i<n; i++) {
            System.out.print("Enter a number: " );
            int number = sc.nextInt();
            vect[i] = number;
        }

        // tranversing the vector and printing only negative numbers
        System.out.println("NEGATIVE NUMBERS: ");
        for (int i=0; i<n; i++) {
            if (vect[i] < 0) {
                System.out.println(vect[i]);
            }
        }
        
        sc.close(); 
    }
}