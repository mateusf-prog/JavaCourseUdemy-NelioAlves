// simple operations with lists

package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProgramList {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        // adding list items
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");

        list.add(2, "Marco"); // add item second position of the list
        list.remove("Anna"); // remove Anna from list

        list.size(); // size list
        for (String x : list) {
            System.out.println(x);
        }  

        System.out.println("-------------------");
        list.remove(1); // remove item of the position one

        // removes only those items that begin with "M"
        list.removeIf(x -> x.charAt(0) == 'M');  // lambda
        for (String x : list) {
            System.out.println(x);
        }  

        // show position of "Marco" and "Bob" in the list
        System.out.println("------------------");
        System.out.println("Index of Bob: " + list.indexOf("Bob"));
        System.out.println("Index of Marco: " + list.indexOf("Marco"));
        System.out.println("-------------------");

        // generates a new list containing only names starting with "A 
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
        for (String x : result) {
            System.out.println(x);
        }

        // filters out items that start with "j" or returns a null value 
        System.out.println("-------------------");
        String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
        System.out.println(name);
    }   
}