/* Programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule 
e mostre a diferença do produto de A e B pelo produto de C e D segundo a 
fórmula: DIFERENCA = (A * B - C * D). */

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        // Cria um objeto scanner para entrada de dados
        Scanner input = new Scanner(System.in);

        int A, B, C, D;
        int diferenca;

        // Entrada de dados
        System.out.println("Digite os valores A, B, C e D: ");
        A = input.nextInt();
        B = input.nextInt();
        C = input.nextInt();
        D = input.nextInt();

        // Processamento dos dados
        diferenca = (A * B) - (C * D);

        // Saída de dados
        System.out.printf("Diferença: %d%n", diferenca);

        input.close();
    }
}