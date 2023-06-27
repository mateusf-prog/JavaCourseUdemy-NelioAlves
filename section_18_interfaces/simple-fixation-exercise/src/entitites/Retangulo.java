package entitites;

public class Retangulo extends Figura implements AreaCalculavel {

    private double base;
    private double altura;

    public Retangulo() {
    }

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double areaCalculavel() {
        return base * altura;
    }

    public String toString() {
        return "Área = " + areaCalculavel();
    }
}
