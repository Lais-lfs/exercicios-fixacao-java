package exerciciosjava.POO03.dominio;

public class Quadrado implements AreaCalculavel {
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calculaArea() {
        double area = Math.pow(this.lado, 2);
        return area;
    }

    @Override
    public String toString() {
        return "Quadrado de lado = " + lado + "cm";
    }
}
