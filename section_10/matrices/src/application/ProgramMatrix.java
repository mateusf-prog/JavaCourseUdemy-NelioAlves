package application;

import java.util.Scanner;

public class ProgramMatrix {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] mat = new int[n][n];  // declaring a matrix

        for (int i=0; i<mat.length; i++) {         // a loop to go through the rows of the array
            for (int j=0; j<mat[i].length; j++) {     // a loop to go through the columns of the matrix 
                mat[i][j] = sc.nextInt(); // reading the input data and storing
            }
        }

        System.out.println("Main diagonal:");
        for (int i=0; i<mat.length; i++) {
            System.out.print(mat[i][i] + " ");  // printing the values that are on the diagonal of the matrix 
        }  
    
        System.out.println();

        int count = 0;
        for (int i=0; i<mat.length; i++) {
            for (int j=0; j<mat[i].length; j++) {
                if (mat[i][j] < 0) {
                    count++;
                }
            }
        }

        sc.close();
    }
}