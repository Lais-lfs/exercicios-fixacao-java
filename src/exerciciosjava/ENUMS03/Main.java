package exerciciosjava.ENUMS03;

public class Main {
    public static void main(String[] args) {
        Prioridade prioridadeBaixa = Prioridade.porValor(1);
        Prioridade prioridadeMedia = Prioridade.porValor(5);
        Prioridade prioridadeAlta = Prioridade.porValor(10);
        //Prioridade prioridadeErro = Prioridade.porValor(9);

        System.out.println("Prioridade " + prioridadeBaixa + " - valor: " + prioridadeBaixa.getValor());
        System.out.println("Prioridade " + prioridadeMedia + " - valor: " + prioridadeMedia.getValor());
        System.out.println("Prioridade " + prioridadeAlta + " - valor: " + prioridadeAlta.getValor());
        //System.out.println("Prioridade " + prioridadeErro + " - valor: " + prioridadeErro.getValor());
    }
}
