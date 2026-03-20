package exerciciosjava.introducao;

import java.util.Scanner;

public class Exercicio09 {
    // 44. Compute n+nn+nnn
    // Escreva um programa em Java que receba um número inteiro (n) e calcule o valor de n+nn+nnn.

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Insira  um número inteiro para calcular o valor de n+nn+nnn:");
        int numero = leitura.nextInt();

        int numero2 = (numero * 10) + numero;
        int numero3 = (numero * 100) + numero2;
        System.out.println(numero + " + " + numero2 + " + " + numero3);
    }
}
