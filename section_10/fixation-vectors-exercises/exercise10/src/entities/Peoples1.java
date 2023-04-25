package entities;

public class Peoples1 {
    private double height;
    private char gender;

    // constructor
    public Peoples1(char gender, double height) {
        this.gender = gender;
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}
