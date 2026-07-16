package exerciciosjava.POO02.dominio;

public class CartaoDeCredito extends Pagamento {
    public CartaoDeCredito(String cliente, double valor) {
        super(cliente, valor);
    }

    @Override
    public void processar() {
        System.out.println("Validando senha do cartão...");
        realizarPagamento();
    }

    @Override
    public void realizarPagamento() {
        System.out.println("Pagamento realizado no cartão de crédito!");
    }
}
