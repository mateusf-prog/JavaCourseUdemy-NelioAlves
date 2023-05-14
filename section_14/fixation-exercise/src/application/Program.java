package application;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        List<Product> products = new ArrayList<Product>(); 
        
        System.out.print("Enter the numer of products: ");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++) {
            System.out.println("Product #" + i + " data: ");
            System.out.print("Common, used or imported (c/u/i)? ");
            char ch = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Price: ");
            double price = sc.nextDouble();
            if (ch == 'c') {
                products.add(new Product(name, price));
            } else if ( ch == 'u') {
                System.out.println("Manufacture date (DD/MM/YYYY): ");
                Date date = sdf.parse(sc.next());

                products.add(new UsedProduct(name, price, date));
            } else {
                System.out.print("Customs fee: ");
                double customsFee = sc.nextDouble();

                products.add(new ImportedProduct(name, price, customsFee));
            }
        }

        System.out.println("\nPRICE TAGS:");
        for (Product product : products) {
            System.out.println(product.priceTag());
        }
        
        sc.close();
    }
}
