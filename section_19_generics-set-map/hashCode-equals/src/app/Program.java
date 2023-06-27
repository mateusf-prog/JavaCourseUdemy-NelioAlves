package app;

import entities.Client;

public class Program {
    public static void main(String[] args) {

        String a = "Alex";
        String b = "Maria";

        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
        System.out.println("\n");

        Client c2 = new Client("Maria", "maria@gmail.com");
        Client c1 = new Client("ALex", "alex@gmail.com");

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c1.equals(c2));
    }
}