// Expressão condicional ternária
// Mateus 20/03/2023

/* Expressão condicional ternária é uma forma simples de escrever uma 
estrutura  de decisão simples em que se avalia uma condição e se executa uma 
operação se a condição for verdadeira e outra operação se a condição for falsa */

import java.util.Scanner;

public class ExpressaoCondicionalTernaria {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double preco = 34.5;
        // Se for verdadeira, execute a expressão 1, caso contrário execute a expressão 2.
        double desconto = (preco < 20) ? preco * 0.1 : preco * 0.05;
        //                 condição    se verdadeira :   se falsa

        System.out.println(desconto);

        input.close();
    }
}


