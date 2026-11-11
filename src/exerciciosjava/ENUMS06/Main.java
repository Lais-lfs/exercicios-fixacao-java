package exerciciosjava.ENUMS06;

import static exerciciosjava.ENUMS06.ProcessadorPagamento.processarPagamento;

public class Main {
    public static void main(String[] args) {
//        ProcessadorPagamento pagamento;
//        pagamento = FormaPagamento.DINHEIRO;
//        System.out.println(pagamento.calcularValorFinal(100));
//
//        pagamento = FormaPagamento.CREDITO;
//        System.out.println(pagamento.calcularValorFinal(100));
//
//        pagamento = FormaPagamento.PIX;
//        System.out.println(pagamento.calcularValorFinal(100));

        processarPagamento(FormaPagamento.DINHEIRO, 100);

        processarPagamento(FormaPagamento.CREDITO, 100);

        processarPagamento(FormaPagamento.PIX, 100);

    }
}
