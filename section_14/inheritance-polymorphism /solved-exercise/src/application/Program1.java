package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import enitties.Employee;
import enitties.OutsourcedEmployee;

public class Program1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        List<Employee> list = new ArrayList<Employee>();

        System.out.print("Enter the number of employees: ");
        int num = sc.nextInt();

        for (int i=1; i<=num; i++) {
            System.out.println("Employee #" + i + " data: ");
            System.out.print("Outsourced (y/n)? ");
            char resp = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Hours: ");
            int hours = sc.nextInt();
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();
            if (resp == 'y') {
                System.out.print("Additional charge: ");
                double additionalCharge = sc.nextDouble();

                Employee emp = new OutsourcedEmployee(name, hours, valuePerHour,additionalCharge);
                list.add(emp);
            } else {
                Employee emp = new Employee(name, hours, valuePerHour);
                list.add(emp);
            }
        }

        System.out.println("\nPAYMENTS: ");
        for (Employee emp : list) {
            System.out.print(emp.getName() + " - $ " + emp.payment() + "\n");
        }

        sc.close();
    }
}
