package entitites;

public class Circulo extends Figura implements AreaCalculavel { 

    private static final double PI = 3.14;

    private double raio;

    public Circulo() {
    }

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double areaCalculavel() {
        return PI * (raio * raio);
    }

    public String toString() {
        return "Área = " + areaCalculavel();
    }
}