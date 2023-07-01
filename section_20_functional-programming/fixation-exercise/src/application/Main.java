package application;

import entities.Employee;

import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Type a salary: ");
        Double salary = sc.nextDouble();

        Employee[] employees = new Employee[5];

        employees[0] = new Employee("Mateus", "mateus@gmail.com", 2100.0);
        employees[1] = new Employee("Bob", "bob@hotmail.com", 3000.0);
        employees[4] = new Employee("Maria", "maria@gmail.com", 2500.0);
        employees[3] = new Employee("Alex", "alex@gmail.com", 1500.0);
        employees[2] = new Employee("Meir", "meiri@gmail.com", 1500.0);

        double sum = 0.0;
        List<Employee> list = Arrays.stream(employees)
                .filter(x ->  x.getSalary() > salary) // filter only employees with getSalary > salary
                .sorted(Comparator.comparing(Employee::getEmail)) //sorted the elements filtered with base in the email
                .toList();

        for (Employee emp : list) {
            System.out.println(emp);
        }
    }
}