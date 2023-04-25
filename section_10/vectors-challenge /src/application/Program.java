package application;

import entities.Rent;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rent[] rooms = new Rent[10];
        int n, room;
        String name, email;

        System.out.print("How many rooms will be rented? ");
        n = sc.nextInt();

        for (int i=0; i<n; i++) {
            System.out.println("Rent #" + i + ":");
            System.out.print("Name: ");
            sc.nextLine();
            name = sc.nextLine();
            System.out.print("Email: ");
            email = sc.nextLine();
            System.out.print("Room: ");
            room = sc.nextInt();
            Rent rent = new Rent(name, email);
            rooms[room] = rent;
        }

        System.out.println("Busy rooms:");
        for (int i=0; i<10; i++) {
            if (rooms[i] != null) {
                System.out.println(i + ": " + rooms[i]);
            }
        }

        sc.close();
    }
}
