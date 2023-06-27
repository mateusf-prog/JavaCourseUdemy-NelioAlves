package application;

import entitites.Circulo;
import entitites.Figura;
import entitites.Quadrado;
import entitites.Retangulo;

public class Program {
    public static void main(String[] args) {
        
        Figura[] vect = new Figura[3];

        vect[0] = new Circulo(40);
        vect[1] = new Quadrado(55.5);
        vect[2] = new Retangulo(40, 10.1);

        for (int i = 0; i < vect.length; i++) {
            System.out.println(vect[i]);
        }
    }
}
