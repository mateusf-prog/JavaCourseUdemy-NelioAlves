package application;

import entities.Product;
import util.PriceUpdate;

import java.util.ArrayList;
import java.util.List;

public  class Main {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("tv", 900.0));
        list.add(new Product("notebook", 1550.0));
        list.add(new Product("tablet", 700.0));
        list.add(new Product("HD case", 80.0));

        list.forEach(Product::staticPriceUpdate);

        list.forEach(System.out::println);
    }
}