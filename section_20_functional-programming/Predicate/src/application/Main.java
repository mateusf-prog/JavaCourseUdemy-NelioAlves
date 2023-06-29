package application;

import entities.Product;
import util.ProductPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("tv", 900.0));
        list.add(new Product("tablet", 950.0));
        list.add(new Product("Mouse", 50.0));
        list.add(new Product("HD case", 80.0));

        Predicate<Product> pred = p -> p.getPrice() >= 100;

        list.removeIf(pred);

        for (Product p : list) {
            System.out.println(p);
        }
    }
}