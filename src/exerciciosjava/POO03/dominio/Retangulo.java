package exerciciosjava.POO03.dominio;

public class Retangulo implements AreaCalculavel {
    private double base;
    private double altura;

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calculaArea() {
        double area = this.base * this.altura;
        return area;
    }

    @Override
    public String toString() {
        return "Retângulo de base = " + base + "cm e altura = " + altura + "cm";
    }
}
