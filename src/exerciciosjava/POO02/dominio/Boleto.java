package exerciciosjava.POO02.dominio;

public class Boleto extends Pagamento {
    public Boleto(String cliente, double valor) {
        super(cliente, valor);
    }

    @Override
    public void processar() {
        realizarPagamento();
    }

    @Override
    public void realizarPagamento() {
        System.out.println("Boleto gerado com sucesso!");
    }
}
