// Estrutua do while
// Mateus 23/03/2023

import java.util.Locale;
import java.util.Scanner;

public class EstruturaDoWhile {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        char resp;

        /* O bloco de comandos 'do' executa uma vez no inicio e a condição é testada
        no final, e se for verdadeira repete novamente o bloco 'do'.*/
        do {
            System.out.print("Digite a temperatura em Celsius: ");
            double C = input.nextDouble();
            double F = 9.0 * C / 5.0 + 32.0;
            System.out.printf("Equivalente em Fahrenheit: %.1f%n", F);
            System.out.print("Deseja reperir (s/n)? ");
            resp = input.next().charAt(0);
        } while (resp != 'n');

        input.close();
    }
}