package entities;

public class Individual extends Contributor{

    private Double healthExpenses;

    public Individual() {
        super();
    }

    public Individual(String name, Double annualIncome, Double healthExpenses) {
        super(name, annualIncome);
        this.healthExpenses = healthExpenses;
    }

    public double getHealthExpenses() {
        return healthExpenses;
    }

    public void setHealthExpenses(Double healthExpenses) {
        this.healthExpenses = healthExpenses;
    }

    @Override
    public double calculateTax() {
        double tax = 0.0;
        if (getAnnualIncome() < 20000.00) {
            tax = (getAnnualIncome() * 0.15 - healthExpenses * 0.5);
        } else {
            tax = (getAnnualIncome() * 0.25 - healthExpenses * 0.5);
        }
        return tax;
    }
}
