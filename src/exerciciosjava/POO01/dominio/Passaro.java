package exerciciosjava.POO01.dominio;

public class Passaro extends Animal {
    private String especie;

    public Passaro(String nome, int idade, String especie) {
        super(nome, idade);
        this.especie = especie;
    }

    @Override
    public String emitirSom() {
        return "Cantando!!";
    }

    @Override
    public String toString() {
        return "Pássaro: " + super.toString() + ", espécie = '" + especie + '\'';
    }
}
