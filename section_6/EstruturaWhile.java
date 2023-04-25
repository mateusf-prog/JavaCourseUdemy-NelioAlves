// Estrutura de repetição While
// Mateus 20/03/2023

import java.util.Scanner;

public class EstruturaWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um valor:");
        int x = input.nextInt();
        input.nextLine(); // limpa o buffer de entrada
        int soma = 0;
        
        // Repete o que tem dentro do bloco enquanto a condição for verdadeira
        while (x != 0) {
            soma += x;
            System.out.println(soma);
        }
        input.close();         
    }
}