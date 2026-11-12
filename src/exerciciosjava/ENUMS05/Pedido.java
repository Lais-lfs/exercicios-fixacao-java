package exerciciosjava.ENUMS05;

public class Pedido {
    private StatusPedido statusPedido = StatusPedido.AGUARDANDO_PAGAMENTO;

    public void mudarStatus(StatusPedido novoStatus) {

        if (this.statusPedido.podeTransicionarPara(novoStatus)) {
            System.out.println("Status alterado de '" + statusPedido + "' para '" + novoStatus + "'");
            this.statusPedido = novoStatus;
        } else {
            throw new IllegalStateException("Transição de '" + statusPedido + "' para '" + novoStatus + "' não permitida.");
        }
    }

    public StatusPedido getStatusPedido() {
        return statusPedido;
    }
}
