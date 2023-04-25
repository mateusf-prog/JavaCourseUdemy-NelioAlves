package application;

import java.util.Locale;
import java.util.Scanner;

public class VectorSum {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;
        double sum=0.0, avg;

        // input data
        System.out.println("How many numbers will you type? ");
        n = sc.nextInt();

        double[] vect = new double[n];

        // storing values in vector
        for(int i=0; i<n; i++) {
            System.out.print("Enter a number: ");
            vect[i] = sc.nextDouble();
        }

        // printing values of vector
        System.out.print("VALUES: ");
        for (int i=0; i<n; i++) {
            System.out.printf("%.1f ", vect[i]);
        }

        // sum of values of vector

        for (int i=0; i<n; i++) {
            sum += vect[i];
        }

        // average of values of vector
        avg = sum / n;

        // output data
        System.out.printf("\nSUM: %.2f\n", sum);
        System.out.printf("AVERAGE: %.2f\n", avg);

        sc.close();
    }
}
