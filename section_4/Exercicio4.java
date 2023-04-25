/*programa que leia o número de um funcionário, seu número de horas trabalhadas, o 
valor que recebe por hora e calcula o salário desse funcionário. A seguir, mostre 
o número e o salário do funcionário, com duas casas decimais */
// Mateus 13/03/2023

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        // Cria um objeto scanner para entrada de dados via teclado
        Scanner input = new Scanner(System.in);

        int num;
        int horas_trabalhadas;
        double valor_hora;
        double salario;

        // Entrada de dados
        System.out.print("Digite o número do funcionário: ");
        num = input.nextInt();
        System.out.print("Digite o número de horas trabalhadas: ");
        horas_trabalhadas = input.nextInt();
        System.out.print("Digite o valor por hora trabalhada: ");
        valor_hora = input.nextDouble();

        // Processamento
        salario = horas_trabalhadas * valor_hora;

        // Saída
        System.out.printf("Número do funcionário: %d%n", num);
        System.out.printf("Salário: U$ %.2f%n", salario);

        input.close();
    }
}