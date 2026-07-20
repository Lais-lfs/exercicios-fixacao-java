package exerciciosjava.POO01.dominio;

public class Cachorro extends Animal {
    private String raca;

    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    public Cachorro(String nome, int idade, String raca) {
        super(nome, idade);
        this.raca = raca;
    }

    @Override
    public void emitirSom() {
        System.out.println("Latindo!!");
    }

    @Override
    public String toString() {
        return "Cachorro: " +
                "raça = '" + raca + '\'' +
                ", nome = '" + nome + '\'' +
                ", idade = " + idade + " anos.";
    }
}
