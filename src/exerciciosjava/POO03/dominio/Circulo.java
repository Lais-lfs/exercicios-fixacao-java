package exerciciosjava.POO03.dominio;

public class Circulo implements AreaCalculavel {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calculaArea() {
        double area = Math.PI * Math.pow(raio, 2);
        return area;
    }

    @Override
    public String toString() {
        return "Círculo com raio = " + raio + "cm";
    }
}
