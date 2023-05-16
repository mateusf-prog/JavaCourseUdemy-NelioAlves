package application;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        method1();
        System.out.println("End program!");

    }

    public static void method1() {
        System.out.println("---start method1---");

        method2();

        System.out.println("---end method1---");
    }

    public static void method2() {

        System.out.println("---start method2---");
        Scanner sc = new Scanner(System.in);
        
        try {
            String[] vect = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vect[position]);
        }
        catch (ArrayIndexOutOfBoundsException a) {
            System.out.println("Invalid position!");
            a.printStackTrace();    // print the excpetion route
            sc.next();
        }
        catch (IndexOutOfBoundsException a) {
            System.out.println("Input error!");
        }

        sc.close();

        System.out.println("---end method2---");
    }
}
