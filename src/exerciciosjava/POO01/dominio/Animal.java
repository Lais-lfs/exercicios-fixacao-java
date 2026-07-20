package exerciciosjava.POO01.dominio;

public abstract class Animal {
    protected String nome;
    protected int idade;

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public abstract String emitirSom();

    @Override
    public String toString() {
        return "nome = '" + nome + '\'' +
                ", idade = " + idade + " anos";
    }
}
