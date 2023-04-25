package application;

import java.util.Scanner;
import java.util.Locale;

public class ProgramEx5{
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many values will each vector have? ");
        int resp = sc.nextInt();

        // creating vectors 
        int[] vectA = new int[resp];
        int[] vectB = new int[resp];
        int[] vectC = new int[resp];

        System.out.println("Enter the values of vector A:");

        // storing values of vector 1
        for (int i=0; i<resp; i++) {
            vectA[i] = sc.nextInt();
        }

        System.out.println("Enter the values of vector B:");

        // storing values of vector 2
        for (int i=0; i<resp; i++) {
            vectB[i] = sc.nextInt();
        }

        System.out.println("RESULT VECTOR C:");

        // value of the sum of the vectors' positions A and B
        for (int i=0; i<resp; i++) {
            int sum = vectA[i] + vectB[i];
            vectC[i] = sum;
            System.out.println(vectC[i]);
        }

        sc.close();
    }
}