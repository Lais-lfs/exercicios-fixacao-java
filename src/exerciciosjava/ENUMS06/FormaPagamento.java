package exerciciosjava.ENUMS06;

public enum FormaPagamento implements ProcessadorPagamento {
    DINHEIRO (0.1) {
        @Override
        public double calcularValorFinal(double valorBruto) {
            return valorBruto - (valorBruto * getPercentual());
        }
    },
    CREDITO (0.05) {
        @Override
        public double calcularValorFinal(double valorBruto) {
            return valorBruto + (valorBruto * getPercentual());
        }
    },
    PIX (0.15) {
        @Override
        public double calcularValorFinal(double valorBruto) {
            return valorBruto - (valorBruto * getPercentual());
        }
    };

    private final double percentual;

    FormaPagamento(double percentual) {
        this.percentual = percentual;
    }

    public double getPercentual() {
        return percentual;
    }
}
