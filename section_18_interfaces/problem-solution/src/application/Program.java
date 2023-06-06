package application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.CarRental;
import entities.Vehicle;
import services.BrazilTaxService;
import services.RentalService;

public class Program {

    public static void main(String args[]) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Enter the rental data ");
        System.out.print("Car model: ");
        String carModel = sc.nextLine();
        System.out.print("Withdrawn (dd/MM/yyyy hh:MM): ");
        LocalDateTime start = LocalDateTime.parse(sc.nextLine(), fmt);
        System.out.print("Return (dd/MM/yyyy hh:MM): ");
        LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), fmt);
        
        CarRental cr = new CarRental(start, finish, new Vehicle(carModel));

        System.out.print("Enter with price per hour: ");
        double pricePerHour = sc.nextDouble();
        System.out.print("Enter with price per day: ");
        double pricePerDay = sc.nextDouble();

        RentalService rentalService = new RentalService(pricePerDay, pricePerHour, new BrazilTaxService());  //BrazilTaxService is the class wich implement  the interface

        rentalService.processInvoice(cr);
    
        System.out.println("INVOICE: ");
        System.out.println("Basic payment: " + cr.getInvoice().getBasicPayment());
        System.out.println("Tax: " + cr.getInvoice().getTax());
        System.out.println("Total payment: " + cr.getInvoice().getTotalPayment());

        sc.close();
    }
}
