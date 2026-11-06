package exerciciosjava.ENUMS04;

public class Main {
    public static void main(String[] args) {
        Operacao operacaoSoma = Operacao.SOMA;
        System.out.println("Soma = " + operacaoSoma.calcular(2,2));

        Operacao operacaoSubtracao = Operacao.SUBTRACAO;
        System.out.println("Subtração = " + operacaoSubtracao.calcular(10, 5));

        Operacao operacaoMultiplicacao = Operacao.MULTIPLICACAO;
        System.out.println("Multiplicação = " + operacaoMultiplicacao.calcular(9,9));

        try {
            Operacao operacaoDivisao = Operacao.DIVISAO;
            System.out.println("Divisão = " + operacaoDivisao.calcular(3,0));
        } catch (ArithmeticException e) {
            System.out.println("Erro na divisão: " + e.getMessage());
        }
    }
}
