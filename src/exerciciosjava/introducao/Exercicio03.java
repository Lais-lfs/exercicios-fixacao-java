package exerciciosjava.introducao;

import java.util.Scanner;

public class Exercicio03 {
    // 11 - Círculo: Área e Perímetro
    // Escreva um programa em Java para imprimir a área e o perímetro de um círculo.

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Informe o valor do raio de um círculo:");
        double valorRaio = leitura.nextDouble();

        double areaCirculo = (valorRaio * valorRaio) * 3.1415926535;
        double perimetroCirculo = 2 * 3.1415926535 * valorRaio;

        System.out.printf("Área = %.2f", areaCirculo);
        System.out.printf("\nPerímetro = %.2f", perimetroCirculo);

    }
}
