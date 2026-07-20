package exerciciosjava.POO01.dominio;

public class Passaro extends Animal {
    private String especie;

    public Passaro(String nome, int idade, String especie) {
        super(nome, idade);
        this.especie = especie;
    }

    @Override
    public void emitirSom() {
        System.out.println("Cantando!!");
    }

    @Override
    public String toString() {
        return "Pássaro: " +
                "espácie = '" + especie + '\'' +
                ", nome = '" + nome + '\'' +
                ", idade = " + idade + " anos.";
    }
}
