package exerciciosjava.POO03.test;

import exerciciosjava.POO03.dominio.*;

public class RelatorioAreas {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(3);
        Quadrado quadrado = new Quadrado(3);
        Retangulo retangulo = new Retangulo(10, 5);

        AreaCalculavel[] figuras = {circulo, quadrado, retangulo};

        for (AreaCalculavel figura : figuras) {
            double area = figura.calculaArea();

            System.out.println(figura);
            System.out.println("Área = " + String.format("%.2f", area) + "cm²");

            System.out.println("---  ".repeat(10));

        }
    }
}
