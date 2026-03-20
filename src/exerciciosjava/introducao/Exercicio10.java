package exerciciosjava.introducao;

public class Exercicio10 {
    // 50. Divisível por 3, 5 e ambos.
    // Escreva um programa em Java para imprimir números entre 1 e 100 divisíveis por 3, 5 e ambos.

    public static void main(String[] args) {
        System.out.println("Números divisíveis por 3:");
        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0) {
                System.out.print(i + ", ");
            }
        }
        System.out.println("\n ");

        System.out.println("Números divisíveis por 5:");
        for (int i = 1; i < 100; i++) {
            if (i % 5 == 0) {
                System.out.print(i + ", ");
            }
        }
        System.out.println("\n ");

        System.out.println("Números divisíveis por 3 e 5:");
        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print(i + ", ");
            }
        }
    }
}
