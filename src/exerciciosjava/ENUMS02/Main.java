package exerciciosjava.ENUMS02;

public class Main {
    public static void main(String[] args) {
        System.out.println("Estados do Brasil:");
        for (EstadosBrasileiros estado : EstadosBrasileiros.values()) {
            System.out.println(estado.getNomeEstado() + "(" + estado.getSigla() + ")");
            System.out.println(estado.getNomeMaiusculo());
            System.out.println("--------- *** ---------");
        }
    }
}
