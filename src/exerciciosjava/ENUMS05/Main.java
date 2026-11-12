package exerciciosjava.ENUMS05;

public class Main {
    public static void main(String[] args) {
        // Teste 01: AGUARDANDO PAGAMENTO -> PAGO
        Pedido pedido01 = new Pedido();
        System.out.println("Teste AGUARDANDO PAGAMENTO -> PAGO");
        pedido01.mudarStatus(StatusPedido.PAGO);
        System.out.println("-------- *** --------");

        // Teste 02: PAGO -> ENVIADO
        System.out.println("Teste PAGO -> ENVIADO");
        pedido01.mudarStatus(StatusPedido.ENVIADO);
        System.out.println("-------- *** --------");

        // Teste 03: ENVIADO -> ENTREGUE
        System.out.println("Teste ENVIADO -> ENTREGUE");
        pedido01.mudarStatus(StatusPedido.ENTREGUE);
        System.out.println("-------- *** --------");

        // Teste 04: AGUARDANDO PAGAMENTO -> CANCELADO
        System.out.println("Teste AGUARDANDO PAGAMENTO -> CANCELADO");
        Pedido pedido02 = new Pedido();
        pedido02.mudarStatus(StatusPedido.CANCELADO);
        System.out.println("-------- *** --------");

        // Teste 05: PAGO -> CANCELADO
        System.out.println("Teste PAGO -> CANCELADO");
        Pedido pedido03 = new Pedido();
        pedido03.mudarStatus(StatusPedido.PAGO);
        pedido03.mudarStatus(StatusPedido.CANCELADO);
        System.out.println("-------- *** --------");

        // Teste 06: ENTREGUE -> CANCELADO
        System.out.println("Teste ENTREGUE -> CANCELADO");
        Pedido pedido04 = new Pedido();
        pedido04.mudarStatus(StatusPedido.PAGO);
        pedido04.mudarStatus(StatusPedido.ENVIADO);
        pedido04.mudarStatus(StatusPedido.ENTREGUE);
        try {
            pedido04.mudarStatus(StatusPedido.CANCELADO);
        } catch (IllegalStateException e) {
            System.out.println("Transição inválida: " + e.getMessage());
        }

    }
}
