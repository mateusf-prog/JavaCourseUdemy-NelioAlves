package entities;

public class Peoples {
    private String name;
    private int age;

    // constructor
    public Peoples(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return "Name: " + name
            + "\nAge: " + age;
    }
}
