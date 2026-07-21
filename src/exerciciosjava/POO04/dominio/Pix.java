package exerciciosjava.POO04.dominio;

public class Pix extends Pagamento {
    public Pix(String cliente, double valor, boolean programaFidelidade) {
        super(cliente, valor, programaFidelidade);
    }

    @Override
    public double percentualDesconto() {
        return 0.1;
    }

    @Override
    public void autenticar() {
        System.out.println("Validando chave PIX...");
    }

    @Override
    public boolean autenticavel() {
        return true;
    }

    @Override
    public void realizarPagamento() {
        System.out.println("Pagamento realizado via PIX.");
    }
}
