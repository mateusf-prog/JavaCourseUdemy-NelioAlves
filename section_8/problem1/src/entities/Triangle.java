package section_8.problem1.src.entities;

public class Triangle {
    public double a;
    public double b;
    public double c;

    // cria o método com a fórmula de calculo da área
    public double area() {
        double p = (a + b + c) / 2.0;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
