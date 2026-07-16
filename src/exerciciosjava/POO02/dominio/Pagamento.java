package exerciciosjava.POO02.dominio;

public abstract class Pagamento implements Processamento {
    protected String cliente;
    protected double valor;

    public Pagamento(String cliente, double valor) {
        this.cliente = cliente;
        this.valor = valor;
    }

    public abstract void realizarPagamento();


    public String getCliente() {
        return cliente;
    }

    public double getValor() {
        return valor;
    }
}
