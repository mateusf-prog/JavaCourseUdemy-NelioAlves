/* Programa para ler o valor do raio de um círculo, e depois mostrar o valor 
da área deste círculo com quatro casas decimais */
// Mateus 13/03/2023

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        // Cria um objeto scanner para entrada de dados via teclado
        Scanner input = new Scanner(System.in);

        double area;
        double raio;
        double pi = 3.14159;

        // Entrada de dados
        System.out.print("Digite o valor do raio: ");
        raio = input.nextDouble();
        
        // Processamento
        area = pi * (Math.pow(raio, 2.0));

        // Saída
        System.out.printf("Área = %.4f", area);

        input.close();
    }
}