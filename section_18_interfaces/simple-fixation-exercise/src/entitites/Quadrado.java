package entitites;

public class Quadrado extends Figura implements AreaCalculavel {

    private double lado;
    
    public Quadrado() {
    }

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double areaCalculavel() {
        return lado * lado;
    }

    public String toString() {
        return "Área = " + areaCalculavel();
    }    
}
