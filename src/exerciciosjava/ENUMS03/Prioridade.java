package exerciciosjava.ENUMS03;

public enum Prioridade {
    BAIXA(1),
    MEDIA(5),
    ALTA(10);

    private final int valor;

    Prioridade(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public static Prioridade porValor(int valor) {
        for (Prioridade prioridade : Prioridade.values()) {
            if (prioridade.getValor() == valor) {
                return prioridade;
            }
        }
        throw new IllegalArgumentException("Valor inválido");
    }
}
