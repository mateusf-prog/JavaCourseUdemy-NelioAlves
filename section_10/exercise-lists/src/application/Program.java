package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import entities.Employee;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();
        Employee employee;
        Integer id, res;
        String name;
        Double salary, percentage;

        System.out.print("How many employees will be registered? ");
        int n = sc.nextInt();

        for (int i=0; i<n; i++) {
            System.out.println("\nEmployee #" + (i+1) + ":");
            System.out.print("Id: ");
            id = sc.nextInt();
            sc.nextLine();
            System.out.print("Name: ");
            name = sc.nextLine();
            System.out.print("Salary: ");
            salary = sc.nextDouble();
            employee = new Employee(id, name, salary);
            list.add(employee);
        }

        System.out.print("\nEnter the employee id that will have salary increase: ");
        res = sc.nextInt();
		Employee emp = list.stream().filter(x -> x.getId() == res).findFirst().orElse(null);
        if (emp == null) {
            System.out.print("This id does not exist!");
        } else {
            System.out.print("Enter the percentage: ");
            percentage = sc.nextDouble();
            emp.increaseSalary(percentage);
        }

        System.out.println("\nList of employees: ");
        for (Employee obj : list) {
            System.out.println(obj.toString());
        }  

        sc.close();
    }
}
