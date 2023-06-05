package entities;

public class Company extends Contributor {

    private Integer numberOfEmployees;

    public Company() {
        super();
    }

    public Company(String name, Double annualBalance, int numberOfEmployees) {
        super(name, annualBalance);
        this.numberOfEmployees = numberOfEmployees;
    }

    public int getNumbeOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public double calculateTax() {
        double tax = 0.0;
        if (numberOfEmployees < 10) {
            tax = getAnnualIncome() * 0.16;
        } else {
            tax = getAnnualIncome() * 0.14;
        }
        return tax;
    } 
}
