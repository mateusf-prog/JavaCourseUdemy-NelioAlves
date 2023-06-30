package application;

import entities.Product;
import model.services.ProductService;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 1500.0));
        list.add(new Product("Notebook", 2000.0));
        list.add(new Product("Tablet", 850.0));
        list.add(new Product("HD case", 80.0));

        ProductService ps = new ProductService();

        // create a function that received other function that has two parameters, one list, one Predicate
        double sum = ps.filteredSum(list, p -> p.getName().charAt(0) == 'N');

        System.out.println("Sum = " + String.format("%.2f", sum));
    }
}