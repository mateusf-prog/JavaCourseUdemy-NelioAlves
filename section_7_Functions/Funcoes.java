// Estudo de funções
// Mateus 23/03/2023

import java.util.Scanner;

public class Funcoes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe três números: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int maior = max(a, b, c);

        showResult(maior);

        sc.close();   
    }
    
    // Cria uma função que retorna o maior número inteiro 
    // entre três inteiros passados como argumentos 
    public static int max(int x, int y, int z) {
        int aux;
        if (x > y && x > z) {
            aux = x;
        }
        else if (x > z) {
            aux = y;
        }
        else {
            aux = z;
        }
        return aux;
    }

    // cria uma função simples que mostra o resultado de forma elegante
    // e nao retorna nenhum valor especificamente
    public static void showResult(int value) {
        System.out.println("Maior: " + value);
    }
}