// Programa que lê dois valores inteiros e exibe a soma 
// Mateus 13/03/2023

import java.util.Scanner;

public class Exercicio1{
    public static void main(String[] args) {
        // Cria um objeto scanner para entrada de dados via teclado
        Scanner input = new Scanner(System.in);

        int v1, v2, soma;

        // Entrada de dados
        System.out.println("Digite dois valores inteiros: ");
        v1 = input.nextInt();
        v2 = input.nextInt();

        // Processamento
        soma = v1 + v2;

        // Saída de dados
        System.out.println("Os dados digitados foram: ");
        System.out.println("Valor 1: " + v1);
        System.out.println("Valor 2: " + v2);
        
        System.out.println("A soma dos dois valores é: " + soma);
        input.close();
    }
}