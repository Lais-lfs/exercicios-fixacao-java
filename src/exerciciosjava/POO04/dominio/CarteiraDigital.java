package exerciciosjava.POO04.dominio;

public class CarteiraDigital extends Pagamento {
    public CarteiraDigital(String cliente, double valor, boolean programaFidelidade) {
        super(cliente, valor, programaFidelidade);
    }

    @Override
    public double percentualDesconto() {
        return 0.07;
    }

    @Override
    public void autenticar() {
        System.out.println("Validando reconhecimento facial...");
    }

    @Override
    public boolean autenticavel() {
        return true;
    }

    @Override
    public void realizarPagamento() {
        System.out.println("Pagamento realizado pela carteira digital.");
    }
}
