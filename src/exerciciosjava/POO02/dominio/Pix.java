package exerciciosjava.POO02.dominio;

public class Pix extends Pagamento {
    public Pix(String cliente, double valor) {
        super(cliente, valor);
    }

    @Override
    public void processar() {
        System.out.println("Validando chave PIX...");
        realizarPagamento();
    }

    @Override
    public void realizarPagamento() {
        System.out.println("Pagamento realizado via PIX.");
    }
}
