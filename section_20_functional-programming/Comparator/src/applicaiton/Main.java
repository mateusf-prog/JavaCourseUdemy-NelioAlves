package applicaiton;

import entities.Product;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("tv", 900.0));
        list.add(new Product("notebook", 1500.0));
        list.add(new Product("tablet", 800.0));
        list.add(new Product("apple watch", 1550.0));

            // sorting the list with funtion lambda syntax
            list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));

        for (Product p : list) {
            System.out.println(p);
        }
    }
}