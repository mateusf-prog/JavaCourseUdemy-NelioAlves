// Estudo - construtores 
// Mateus 30/03/2023
// Reutilizando o programa da seção 8 (melhorando)

package application;

import java.util.Scanner;
import entities.Product1;
import java.util.Locale;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Price: ");
        double price = sc.nextDouble();

        // passando as dois argumentos para o construtor
        // (usará o construtor que utiliza dois parâmetros)
        Product1 product = new Product1(name, price);

        System.out.println("Product data: " + product);
        System.out.println();

        System.out.print("Enter the number of products to be added in stock: ");
        int quantity = sc.nextInt();
        product.addProducts(quantity);

        System.out.println("Update data: " + product);
        System.out.println();

        System.out.print("Enter the number of products to be removed from stock: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);

        System.out.println("Update data: " + product);
        System.out.println();

        sc.close();
    }
}