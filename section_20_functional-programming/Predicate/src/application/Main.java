package application;

import entities.Product;
import util.ProductPredicate;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("tv", 900.0));
        list.add(new Product("tablet", 950.0));
        list.add(new Product("Mouse", 50.0));
        list.add(new Product("HD case", 80.0));

        // method reference
        list.removeIf(Product ::nonStaticProductPredicate);

        for (Product p : list) {
            System.out.println(p);
        }
    }
}