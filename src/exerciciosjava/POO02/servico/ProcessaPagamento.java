package exerciciosjava.POO02.servico;

import exerciciosjava.POO02.dominio.Boleto;
import exerciciosjava.POO02.dominio.CartaoDeCredito;
import exerciciosjava.POO02.dominio.Pagamento;
import exerciciosjava.POO02.dominio.Pix;

public class ProcessaPagamento {
    public static void processar(Pagamento pagamento) {

        if (pagamento instanceof CartaoDeCredito) {
            CartaoDeCredito cartaoDeCredito = (CartaoDeCredito) pagamento;
            cartaoDeCredito.processar();
        } else if (pagamento instanceof Pix) {
            Pix pix = (Pix) pagamento;
            pix.processar();
        } else if (pagamento instanceof Boleto) {
            Boleto boleto = (Boleto) pagamento;
            boleto.realizarPagamento();
        }
        emitirComprovante(pagamento);
    }

    public static void emitirComprovante(Pagamento pagamento) {
        System.out.println(" ** Comprovante de Pagamento ** ");
        System.out.println("Pagamento realizado pelo(a) " + pagamento.getCliente() + ".");
        System.out.println("Valor: R$ " + pagamento.getValor());
    }
}
