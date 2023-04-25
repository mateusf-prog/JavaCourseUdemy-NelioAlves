/* Programa para ler o código de uma peça 1, o número de peças 1, o valor 
unitário de cada peça 1, o código de uma peça 2, o número de peças 2 e o 
valor unitário de cada peça 2. Calcule e mostre o valor a ser pago. */

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        // Criando um objeto scanner para entrada de dados
        Scanner input = new Scanner(System.in);

        int quantidade;
        double valor, valorFinal;

        // Entrada de dados
        System.out.print("Digite a quantidade de peças: ");
        quantidade = input.nextInt();
        System.out.print("Digite o valor unitário da peça: ");
        valor = input.nextDouble();

        // Processamento dos dados
        valorFinal = valor * quantidade;

        // Saída de dados
        System.out.printf("Valor total a pagar: R$ %.2f%n", valorFinal);

        input.close();
    }
}