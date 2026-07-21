package exerciciosjava.POO04.dominio;

public class CartaoDeCredito extends Pagamento {


    public CartaoDeCredito(String cliente, double valor, boolean programaFidelidade) {
        super(cliente, valor, programaFidelidade);
    }

    @Override
    public double percentualDesconto() {
        return 0.05;
    }

    @Override
    public void autenticar() {
        System.out.println("Validando senha do cartão...");
    }

    @Override
    public boolean autenticavel() {
        return true;
    }

    @Override
    public void realizarPagamento() {
        System.out.println("Pagamento realizado no cartão de crédito!");
    }
}
