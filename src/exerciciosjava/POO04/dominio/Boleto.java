package exerciciosjava.POO04.dominio;

public class Boleto extends Pagamento {
    public Boleto(String cliente, double valor, boolean programaFidelidade) {
        super(cliente, valor, programaFidelidade);
    }

    @Override
    public void realizarPagamento() {
        System.out.println("Boleto gerado com sucesso!");
    }

    @Override
    public double percentualDesconto() {
        return 0;
    }
}
