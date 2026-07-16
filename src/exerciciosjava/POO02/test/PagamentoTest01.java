package exerciciosjava.POO02.test;

import exerciciosjava.POO02.dominio.Boleto;
import exerciciosjava.POO02.dominio.CartaoDeCredito;
import exerciciosjava.POO02.dominio.Pagamento;
import exerciciosjava.POO02.dominio.Pix;
import exerciciosjava.POO02.servico.ProcessaPagamento;

public class PagamentoTest01 {
    public static void main(String[] args) {
        CartaoDeCredito cartaoDeCredito = new CartaoDeCredito("Lara", 25);
        Pagamento pagamento02 = new Pix("Luís", 30);
        Pagamento pagamento03 = new Boleto("Lis", 50);

        ProcessaPagamento.processar(cartaoDeCredito);
        System.out.println("----------------------");
        ProcessaPagamento.processar(pagamento02);
        System.out.println("----------------------");
        ProcessaPagamento.processar(pagamento03);
    }
}
