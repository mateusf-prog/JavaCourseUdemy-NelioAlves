package application;

import entities.Product;
import util.UpperCaseName;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 1000.0));
        list.add(new Product("Tablet", 750.0));
        list.add(new Product("Notebook", 1500.0));
        list.add(new Product("HD case", 85.0));

        Function<Product, String> func = p -> p.getName().toUpperCase();

        List<String> names = list.stream().map(func).collect(Collectors.toList());
        //                                 using lambda func

        // list.stream = convert the list to stream
        // .map(function) = apply on each element of the list, an instance of UpperCaseName
        // .collect(Collector.toList()) = return stream to list

        names.forEach(System.out::println);
    }
}