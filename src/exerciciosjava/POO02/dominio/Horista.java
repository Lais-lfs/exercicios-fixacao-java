package exerciciosjava.POO02.dominio;

public class Horista extends Funcionario {
    private double horasTrabalhadas;
    private double horasExtras;
    private double valorHora;
    private double valorHoraExtra;

    public Horista(String nome, String funcao, double valorHora, double horasTrabalhadas) {
        super(nome, funcao);
        this.valorHora = valorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public Horista(String nome, String funcao, double valorHora, double horasTrabalhadas, double horasExtras, double valorHoraExtra) {
        super(nome, funcao);
        this.horasTrabalhadas = horasTrabalhadas;
        this.horasExtras = horasExtras;
        this.valorHora = valorHora;
        this.valorHoraExtra = valorHoraExtra;
    }

    public double calcularValorHoras() {
        double totalHoras = horasTrabalhadas * valorHora;
        return totalHoras;
    }

    public double calcularValorHorasExtras() {
        double totalHorasExtras = horasExtras * valorHoraExtra;
        return totalHorasExtras;
    }

    @Override
    public double vencimentos() {
        double valorRecebido = calcularValorHoras() + calcularValorHorasExtras();
        return valorRecebido;
    }
}
