package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Installment {

    private static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");


    private LocalDate date;
    private double amount;

    public Installment() {
    }

    public Installment(LocalDate date, double amount) {
        this.date = date;
        this.amount = amount;
    }

    public LocalDate getdate() {
        return this.date;
    }

    public void setdate(LocalDate date) {
        this.date = date;
    }

    public double getAmount() {
        return this.amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return date.format(fmt) + " - " + String.format("%.2f", amount);
    }
}

