package exerciciosjava.ENUMS06;

public interface ProcessadorPagamento {
    double calcularValorFinal (double valorBruto);

    static void processarPagamento(ProcessadorPagamento processador, double valorBruto) {

        double valorFinal = processador.calcularValorFinal(valorBruto);

        System.out.println("Valor final: R$ " + valorFinal);
    }
}
