package exerciciosjava.ENUMS01;

public class Main {
    public static void verificarDia (DiaDaSemana diaDaSemana) {
        switch (diaDaSemana) {
            case SEGUNDA , TERCA, QUARTA, QUINTA, SEXTA:
                System.out.println("Dia útil");
                break;
            case SABADO, DOMINGO:
                System.out.println("Fim de semana");
                break;
        }
    }

    public static void main(String[] args) {
        verificarDia(DiaDaSemana.SEGUNDA);
        verificarDia(DiaDaSemana.TERCA);
        verificarDia(DiaDaSemana.QUARTA);
        verificarDia(DiaDaSemana.QUINTA);
        verificarDia(DiaDaSemana.SEXTA);
        verificarDia(DiaDaSemana.SABADO);
        verificarDia(DiaDaSemana.DOMINGO);

    }
}
