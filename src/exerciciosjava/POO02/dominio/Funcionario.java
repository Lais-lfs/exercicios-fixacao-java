package exerciciosjava.POO02.dominio;

public abstract class Funcionario {
    protected String nome;
    protected String funcao;

    public Funcionario(String nome, String funcao) {
        this.nome = nome;
        this.funcao = funcao;
    }

    public abstract double vencimentos();

    @Override
    public String toString() {
        return "Funcionário: " +
                "nome='" + nome + '\'' +
                ", funcao='" + funcao + '\'';
    }
}
