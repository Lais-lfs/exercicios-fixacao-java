package exerciciosjava.POO01.dominio;

public class Gato extends Animal {
    private String raca;

    public Gato(String nome, int idade, String raca) {
        super(nome, idade);
        this.raca = raca;
    }

    @Override
    public void emitirSom() {
        System.out.println("Miando!!");
    }

    @Override
    public String toString() {
        return "Gato: " +
                "raça = '" + raca + '\'' +
                ", nome = '" + nome + '\'' +
                ", idade = " + idade + " anos.";
    }
}
