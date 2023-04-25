// Exercício 3 do capítulo
// Mateus 

package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Student;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student std = new Student();

        System.out.print("Digite seu nome: ");
        std.name = sc.next();
        System.out.println("Digite as três notas: ");
        std.n1 = sc.nextInt();
        std.n2 = sc.nextInt();
        std.n3 = sc.nextInt();

        System.out.println("FINAL GRADE: " + std.finalGrade());
        
        if (std.finalGrade() < 60) {
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS%n", std.missingPoints());
        }
        else {
            System.out.println("PASS");
        }

        sc.close();
    }
}