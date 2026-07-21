package exerciciosjava.POO04.servico;

import exerciciosjava.POO04.dominio.Pagamento;

public class ProcessaPagamento {
    static int totalDePagamentos;
    static double valorTotalRecebido;
    static int pagamentosAutenticados;
    static int pagamentosSemAutenticacao;

    public static void processar(Pagamento pagamento) {
        pagamento.processar();

        if (pagamento.isProgramaFidelidade()) {
            emitirComprovanteClienteProgramaFidelidade(pagamento);
        } else {
            emitirComprovante(pagamento);
        }

        totalDePagamentos++;
        valorTotalRecebido += pagamento.getValorFinal();

        if(pagamento.autenticavel()){
            pagamentosAutenticados++;
        } else {
            pagamentosSemAutenticacao++;
        }
    }

    public static void emitirComprovante(Pagamento pagamento) {
        System.out.println(" ** Comprovante de Pagamento ** ");
        System.out.println("Pagamento realizado pelo(a) " + pagamento.getCliente() + ".");
        System.out.printf("Valor: R$ %.2f%n", pagamento.getValor());
    }

    public static void gerarRelatorioFinal() {
        System.out.println("===== RELATÓRIO =====\n" +
                        "Total de pagamentos: " + totalDePagamentos + "\n" +
                        "Valor total recebido: R$ " + String.format("%.2f", valorTotalRecebido) + "\n" +
                        "Pagamentos autenticados: " + pagamentosAutenticados + "\n" +
                        "Pagamentos sem autenticação: " + pagamentosSemAutenticacao + "\n"
        );
    }

    public static void emitirComprovanteClienteProgramaFidelidade(Pagamento pagamento) {
        System.out.println(" ** Comprovante de Pagamento **\n" +
                "Pagamento realizado pelo(a) " + pagamento.getCliente() + ".\n"+
                "Valor original: R$ " + String.format("%.2f", pagamento.getValor()) + "\n" +
                "Desconto: R$ " + String.format("%.2f", pagamento.getValorDesconto()) + "\n" +
                "Valor final: R$ " + String.format("%.2f", pagamento.getValorFinal())
        );
    }
}
