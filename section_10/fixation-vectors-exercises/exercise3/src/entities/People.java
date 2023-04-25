package entities;

public class People {
    private String name;
    private int age;
    private double height;

    // constructor
    public People(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String toString() {
        return "Name: " + name
            + "\nAge: " + age
            + "\nHeight: " + String.format("%.2f%n", age);
    }
}
