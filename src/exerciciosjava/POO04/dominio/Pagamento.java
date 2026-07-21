package exerciciosjava.POO04.dominio;

public abstract class Pagamento implements Processamento {
    protected String cliente;
    protected double valor;
    protected boolean programaFidelidade;
    protected double valorFinal;
    protected double valorDesconto;

    public Pagamento(String cliente, double valor, boolean programaFidelidade) {
        this.cliente = cliente;
        this.valor = valor;
        this.programaFidelidade = programaFidelidade;
    }

    @Override
    public void processar() {
        calcularDesconto();

        autenticar();

        realizarPagamento();
    }

    public void calcularDesconto() {
        this.valorDesconto = this.valor * percentualDesconto();
        this.valorFinal = this.valor;

        if(programaFidelidade) {
            this.valorFinal = valor - (valor * percentualDesconto());
        }
    };

    public abstract double percentualDesconto();

    public void autenticar() {};

    public boolean autenticavel(){
        return false;
    };

    public abstract void realizarPagamento();


    public String getCliente() {
        return cliente;
    }

    public double getValor() {
        return valor;
    }

    public double getValorFinal() {
        return valorFinal;
    }

    public double getValorDesconto() {
        return valorDesconto;
    }

    public boolean isProgramaFidelidade() {
        return programaFidelidade;
    }
}
