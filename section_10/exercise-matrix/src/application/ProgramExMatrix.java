package application;

import java.util.Scanner;

public class ProgramExMatrix {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int lines, columns, num;

        System.out.print("Lines: ");
        lines = sc.nextInt();
        System.out.print("Columns: ");
        columns = sc.nextInt();

        int[][] mat = new int[lines][columns];

        for (int i=0; i<lines; i++) {
            for (int j=0; j<columns; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nType a number that belongs to the matrix: ");
        num = sc.nextInt();

        for (int i=0; i<mat.length; i++) {
            for (int j=0; j<mat[i].length; j++) {
                if (mat[i][j] == num) {
                    System.out.println("\nPosition " + i + ", " + j);
					if (j > 0) {
						System.out.println("Left: " + mat[i][j-1]);
					}
					if (i > 0) {
						System.out.println("Up: " + mat[i-1][j]);
					}
					if (j < mat[i].length-1) {
						System.out.println("Right: " + mat[i][j+1]);
					}
					if (i < mat.length-1) {
						System.out.println("Down: " + mat[i+1][j]);
					}
                }
            }
        }

        sc.close();
    }
    
}
