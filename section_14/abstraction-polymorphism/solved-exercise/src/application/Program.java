package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Contributor;
import entities.Individual;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        List<Contributor> list = new ArrayList<Contributor>();

        System.out.print("Enter the numbers of tax payers: ");
        int n = sc.nextInt();

        for (int i=0; i<n; i++) {
            System.out.print("Individual of company (i/c)? ");
            char ch = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Annual income: ");
            double annualIncome = sc.nextDouble();
            if (ch == 'i') {
                System.out.print("Health expenditures: ");
                double healthExpenses = sc.nextDouble();
                list.add(new Individual(name, annualIncome, healthExpenses));
            } else {
                System.out.print("Number of employees: ");
                int numebrOfEmployees = sc.nextInt();
                list.add(new Company(name, annualIncome, numebrOfEmployees));
            }
        }


        double sum = 0.0;
        System.out.println("\nTAXES PAID:");
        for (Contributor contributor : list) {
            System.out.printf("\n" + contributor.getName() + ": $ " 
            + String.format("%.2f", contributor.calculateTax()));
            sum += contributor.calculateTax();
        }
        System.out.printf("\n\nTOTAL TAXES: $ %.2f%n", sum);

        sc.close();
    }
}
