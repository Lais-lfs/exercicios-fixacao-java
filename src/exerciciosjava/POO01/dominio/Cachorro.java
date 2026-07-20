package exerciciosjava.POO01.dominio;

public class Cachorro extends Animal {
    private String raca;

    public Cachorro(String nome, int idade, String raca) {
        super(nome, idade);
        this.raca = raca;
    }

    @Override
    public String emitirSom() {
        return "Latindo!!";
    }

    @Override
    public String toString() {
        return "Cachorro: " + super.toString() + ", raça = '" + raca + '\'';
    }
}
