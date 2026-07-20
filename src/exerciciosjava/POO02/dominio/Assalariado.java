package exerciciosjava.POO02.dominio;

public class Assalariado extends Funcionario {
    private double salarioFixo;

    public Assalariado(String nome, String funcao, double salarioFixo) {
        super(nome, funcao);
        this.salarioFixo = salarioFixo;
    }

    @Override
    public double vencimentos() {
        return salarioFixo;
    }
}
