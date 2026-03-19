package exerciciosjava.introducao;

import java.util.Scanner;

public class Exercicio02 {
    // 07 - Tabuada de Multiplicação:
    // Escreva um programa em Java que receba um número como entrada e imprima sua tabuada até 10.
    public static void main(String[] args) {
        System.out.println("Insira o número que você deseja a tabuada:");
        Scanner leitura = new Scanner(System.in);

        int number;
        number = leitura.nextInt();

        for (int i = 1; i <= 10 ; i++) {
            int result = number * i;
            System.out.println(number + " x " + i + " = " + result);
        }
    }
}
