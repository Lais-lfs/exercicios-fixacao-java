package exerciciosjava.POO01.test;

import exerciciosjava.POO01.dominio.Animal;
import exerciciosjava.POO01.dominio.Cachorro;
import exerciciosjava.POO01.dominio.Gato;
import exerciciosjava.POO01.dominio.Passaro;

public class AnimalTest01 {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Mel", 14, "Pinscher");
        Gato gato = new Gato("Shaninha", 6, "SRD");
        Passaro passaro = new Passaro("Zeca", 18, "Papagaio");

        Animal[] animals = {cachorro, gato, passaro};

//        System.out.println(cachorro); (Essas 3 linhas equivalem a 1ª linha do FOR)
//        System.out.println(gato);
//        System.out.println(passaro);

        for (Animal animal : animals) {
            System.out.println(animal);
            animal.emitirSom();
            System.out.println("-".repeat(30));
        }
    }
}
