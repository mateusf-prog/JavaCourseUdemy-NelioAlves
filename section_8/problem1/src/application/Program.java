// Estudo de classes
// Mateus 24/03/2023

/* Fazer um programa para ler as medidas dos lados de dois triângulos 
X e Y (suponha medidas válidas). Em seguida, mostrar o valor das áreas 
dos dois triângulos e dizer qual dos dois triângulos possui a maior área.*/
// OBS: Fórmula no pdf na pasta raiz

package section_8.problem1.src.application;

import java.util.Locale;
import java.util.Scanner;

import section_8.problem1.src.entities.Triangle; 

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // instanciando dois objetos da classe Triangle
        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        // recebendo as medidas
        System.out.println("Entre com as medidas do triângulo X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        System.out.println("Entre com as medidas do triângulo Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        // Chamando o método da classe Triangle para cálculo da área
        double areaX = x.area();
        double areaY = y.area();

        // imprimindo as áreas
        System.out.printf("Área do triângulo X: %.4f%n", areaX);
        System.out.printf("Área do triângulo Y: %.4f%n", areaY);

        // Imprimindo a área maior  
        if (areaX > areaY) {
            System.out.println("Área maior: X");
        }
        else {
            System.out.println("Área maior: Y");
        }

        sc.close();
    }
}
