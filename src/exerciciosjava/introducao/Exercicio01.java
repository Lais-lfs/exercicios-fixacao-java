package exerciciosjava.introducao;

import java.util.Scanner;

public class Exercicio01 {
    // 04 - Escreva um programa em Java para imprimir os resultados de operações aritméticas.
    // Usuário deve informar a quantidade de números que ele quer usar,
    // inserir os números no terminal e informar a operação que deseja realizar com esses números.
    // E seguida, imprimir o resultado no terminal.

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Informe a opção referente a operação aritmética que você deseja realizar:" +
                "\n 1 - Soma (+)" +
                "\n 2 - Subtração (-)" +
                "\n 3 - Multiplicação (*)" +
                "\n 4 - Divisão (/)");

        int operacaoAritmetica = leitura.nextInt();
        int quantidadeNumerica;

        switch (operacaoAritmetica) {
            case 1:
                quantidadeNumerica = informarQuantidade();
                System.out.println("O resultado da operação é: " + realizarOperacao(quantidadeNumerica, 1));
                break;

            case 2:
                quantidadeNumerica = informarQuantidade();
                System.out.println("O resultado da operação é: " + realizarOperacao(quantidadeNumerica, 2));
                break;

            case 3:
                quantidadeNumerica = informarQuantidade();
                System.out.println("O resultado da operação é: " + realizarOperacao(quantidadeNumerica, 3));
                break;

            case 4:
                quantidadeNumerica = informarQuantidade();
                System.out.println("O resultado da operação é: " + realizarOperacao(quantidadeNumerica, 4));
                break;

            default:
                System.out.println("Opção inválida, tente novamente.");
                break;
        }
    }

    public static int informarQuantidade() {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Informe a quantidade de números que você deseja usar:");
        int quantidadeNumeros = leitura.nextInt();

        return quantidadeNumeros;
    }

    public static double[] listaDeNumeros(int quantidadeDeNumeros) {
        double[] numeros = new double[quantidadeDeNumeros];
        double num;
        Scanner leitura = new Scanner(System.in);

        for (int i = 0; i < quantidadeDeNumeros; i++) {
            System.out.println("Informe o " + (i + 1) + "º número:");

            num = leitura.nextDouble();
            numeros[i] = num;
        }
        return numeros;
    }

    public static double realizarOperacao(int quantidadeDeNumeros, int opcaoEscolhida) {

        double[] numeros = listaDeNumeros(quantidadeDeNumeros);
        double resultado = 0;

        for (int j = 0; j < numeros.length; j++) {
            if (j == 0) {
                resultado = numeros[j];
            } else {
                switch (opcaoEscolhida) {
                    case 1:
                        resultado += numeros[j];
                        break;
                    case 2:
                        resultado -= numeros[j];
                        break;
                    case 3:
                        resultado *= numeros[j];
                        break;
                    case 4:
                        resultado /= numeros[j];
                        break;
                }
            }
        }
        return resultado;
    }
}