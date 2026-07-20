package exerciciosjava.POO02.dominio;

public class ComissionadoComSalarioBase extends Comissionado {
    private double salarioBase;

    public ComissionadoComSalarioBase(String nome, String funcao, double valorTotalVendido, double comissao, double salarioBase) {
        super(nome, funcao, valorTotalVendido, comissao);
        this.salarioBase = salarioBase;
    }

    public double aplicarBonus(){
        double valorComSalario = vencimentos();
        return valorComSalario += valorComSalario * 0.10;
    }

    @Override
    public double vencimentos() {
        double valorRecebido = salarioBase + super.vencimentos();
        return valorRecebido;
    }
}
