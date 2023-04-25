// Exercício 2 do capítulo
// Mateus 26/03/2023

import java.util.Locale;
import java.util.Scanner;
import section_8.Exercicio2.src.entities.Rectangle;

public class Program {
    public static void main(String[] args) {

        // setando a localidade e criando um objeto scanner
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // lendo os dados de entrada
        Rectangle rect = new Rectangle();
        System.out.print("Informe a lagura do retângulo: ");
        rect.width = sc.nextDouble();
        System.out.print("Informe a altura do retângulo: ");
        rect.height = sc.nextDouble();

        // imprimindo os dados de sa
        System.out.println("AREA: " + rect.area());
        System.out.println("PERIMETER: " + rect.perimeter());
        System.out.printf("DIAGONAL: %.2f%n", rect.diagonal());

        sc.close();
    }
}

