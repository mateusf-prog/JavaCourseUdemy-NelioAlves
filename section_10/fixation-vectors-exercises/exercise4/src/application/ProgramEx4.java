// Program: Even numbers

import java.util.Scanner;

public class ProgramEx4{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("How many numbers you will type? ");
        int res  = sc.nextInt();

        // creating and storing numbers in the vector
        int[] vect = new int[res];
        for (int i=0; i<res; i++) {
            System.out.print("Enter a number: ");
            vect[i] = sc.nextInt();
        }

        // separating and counting only even numbers
        int count=0;
        System.out.println("\nEven numbers: ");
        for (int i=0; i<res; i++) {
            if (vect[i] % 2 == 0 ) {
                System.out.print(vect[i] + "  ");
                count++;
            }
        }

        System.out.printf("\n\nQuantity of even numbers: %d\n", count);

        sc.close();
    }
}