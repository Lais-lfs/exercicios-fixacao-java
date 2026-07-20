package exerciciosjava.POO02.dominio;

public class Comissionado extends Funcionario {
    private double valorTotalVendido;
    private double comissao;

    public Comissionado(String nome, String funcao, double valorTotalVendido, double comissao) {
        super(nome, funcao);
        this.valorTotalVendido = valorTotalVendido;
        this.comissao = comissao;
    }

    @Override
    public double vencimentos() {
        return valorTotalVendido * comissao;
    }
}
