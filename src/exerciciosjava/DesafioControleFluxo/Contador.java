package exerciciosjava.DesafioControleFluxo;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o 1º parâmetro:");
        int primeiroParametro = leitura.nextInt();

        System.out.println("Digite o 2º parâmetro:");
        int segundoParametro = leitura.nextInt();

        try {
            contar(primeiroParametro, segundoParametro);
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void contar(int primeiroParametro, int segundoParametro) throws ParametrosInvalidosException {
        if (primeiroParametro > segundoParametro) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro.");
        }

        int contagem = segundoParametro - primeiroParametro;

        System.out.println("Contagem:");

        for (int i = 1; i <= contagem; i++) {
            System.out.println(i);
        }
    }
}
