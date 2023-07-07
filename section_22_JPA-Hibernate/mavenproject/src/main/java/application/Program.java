package application;

import dominio.Pessoa;

public class Program {
    public static void main(String[] args) {
        
        Pessoa p1 = new Pessoa(1, "Mateus", "mateus@gmail.com");
        Pessoa p2 = new Pessoa(3, "Mark", "mark@gmail.com");
        Pessoa p3 = new Pessoa(7, "Alex", "alex@gmail.com");

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
}
