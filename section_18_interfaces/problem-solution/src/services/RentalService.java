package services;

import java.time.Duration;

import entities.CarRental;
import entities.Invoice;

public class RentalService {

    private double pricePerDay;
    private double pricePerHour;

    private TaxService taxService;

    public RentalService(double pricePerDay, double pricePerHour, TaxService taxService) {  // taxService is the interface
        this.pricePerDay = pricePerDay;
        this.pricePerHour = pricePerHour;
        this.taxService = taxService;
    }
    
    public void  processInvoice(CarRental carRental) {
        double minutes = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();   // time between two dates 
        double hours = minutes / 60.0;

        double basicPayment;
        if (hours <= 12.0) {
            basicPayment = pricePerHour * Math.ceil(hours);
        }
        else {
            basicPayment = pricePerDay * Math.ceil(hours / 24);
        }

        double tax = taxService.tax(basicPayment);

        carRental.setInvoice(new Invoice(basicPayment, tax));
    }
}
