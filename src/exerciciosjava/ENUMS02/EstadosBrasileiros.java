package exerciciosjava.ENUMS02;

public enum EstadosBrasileiros {
    MINAS_GERAIS("Minas Gerais", "MG"),
    SAO_PAULO("São Paulo", "SP"),
    RIO_DE_JANEIRO("Rio de Janeiro", "RJ"),
    ESPIRITO_SANTO("Espírito Santo", "ES"),
    ACRE("Acre", "AC"),
    AMAPA("Amapá", "AP"),
    AMAZONAS("Amazonas", "AM"),
    PARA("Pará", "PA"),
    RONDONIA("Rondônia", "RO"),
    RORAIMA("Roraima", "RR"),
    TOCANTIS("Tocantis", "TO"),
    ALAGOAS("Alagoas", "AL"),
    BAHIA("Bahia", "BA"),
    CEARA("Ceará", "CE"),
    MARANHAO("Maranhão", "MA"),
    PARAIBA("Paraíba", "PB"),
    PERNANBUCO("Pernanbuco", "PE"),
    PIAUI("Piauí", "PI"),
    RIO_GRANDE_DO_NORTE("Rio Grande do Norte", "RN"),
    SERGIPE("Sergipe", "SE"),
    GOIAS("Goiás", "GO"),
    MATO_GROSSO("Mato Grosso", "MT"),
    MATO_GROSSO_DO_SUL("Mato Grosso do Sul", "MS"),
    DISTRITO_FEDERAL("Distrito Federal", "DF"),
    PARANA("Paraná", "PR"),
    RIO_GRANDE_DO_SUL("Rio Grande do Sul", "RS"),
    SANTA_CATARINA("Santa Catarina", "SC");

    private String nomeEstado;
    private String sigla;
    private String nomeMaiusculo;

    EstadosBrasileiros(String nomeEstado, String sigla) {
        this.nomeEstado = nomeEstado;
        this.sigla = sigla;
    }

    public String getNomeEstado() {
        return nomeEstado;
    }

    public String getSigla() {
        return sigla;
    }

    public String getNomeMaiusculo() {
        nomeMaiusculo = nomeEstado.toUpperCase();
        return nomeMaiusculo;
    }
}
