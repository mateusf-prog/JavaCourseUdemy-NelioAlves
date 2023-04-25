package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class Program1 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        // cria um array que pode armazenar 'n' elementos do tipo Product
        Product[] vect = new Product[n];
        
        // percorrendo o array, lendo as entradas e armazenando no índice
        for (int i=0; i<n; i++) {
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            vect[i] = new Product(name, price); 
        }

        double sum = 0.0;
        for (int i=0; i<n; i++) {
            sum += vect[i].getPrice(); //acessando o vetor na posição 'i'
        }
        double avg = sum / n;
        
        System.out.printf("AVERAGE PRICE = %.2f%n", avg);

        sc.close();
    }
}