package exerciciosjava.ENUMS05;

public enum StatusPedido {
    AGUARDANDO_PAGAMENTO {
        @Override
        public boolean podeTransicionarPara(StatusPedido novoStatus) {
            return novoStatus == PAGO || novoStatus == CANCELADO;
        }
    },
    PAGO {
        @Override
        public boolean podeTransicionarPara(StatusPedido novoStatus) {
            return novoStatus == ENVIADO || novoStatus == CANCELADO;
        }
    },
    ENVIADO {
        @Override
        public boolean podeTransicionarPara(StatusPedido novoStatus) {
            return novoStatus == ENTREGUE;
        }
    },
    ENTREGUE {
        @Override
        public boolean podeTransicionarPara(StatusPedido novoStatus) {
            return false;
        }
    },
    CANCELADO {
        @Override
        public boolean podeTransicionarPara(StatusPedido novoStatus) {
            return false;
        }
    };

    public abstract boolean podeTransicionarPara(StatusPedido novoStatus);
}
