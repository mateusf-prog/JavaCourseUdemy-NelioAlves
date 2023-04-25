package section_8.Exercicio1.src.entitites;

public class Employee {
    public String name;
    public double grossSalary;
    public double tax;
    
    // cálculo salário líquido
    public double NetSalary() {
        return grossSalary - tax;
    }

    // incrementar porcentagem 
    public void increaseSalary(double percentage) {
        grossSalary = grossSalary + percentage/100 * grossSalary;
    }

    // representar o objeto em formato de String contendo todos os dados
    public String toString() {
        return name
            + ", $ " + String.format("%.2f ", grossSalary - tax);
    }
}
