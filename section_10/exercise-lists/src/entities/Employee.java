package entities;

public class Employee {
    private Integer id;
    private String name;
    private Double salary;

    public Employee(Integer id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(double value) {
        this.salary = value;
    }

    public void increaseSalary(double value) {
        double increase = salary * value / 100;
        this.salary += increase;
    }

    public String toString() {
        return + id + ", " + name + ", " + salary; 
    }
}
