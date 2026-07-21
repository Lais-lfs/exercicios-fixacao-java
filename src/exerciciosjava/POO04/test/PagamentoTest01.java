package exerciciosjava.POO04.test;

import exerciciosjava.POO04.dominio.*;
import exerciciosjava.POO04.servico.ProcessaPagamento;

import java.util.ArrayList;
import java.util.List;

public class PagamentoTest01 {
    public static void main(String[] args) {
        List<Pagamento> pagamentos = new ArrayList<>();

        pagamentos.add(new CartaoDeCredito("Lara", 25, false));
        pagamentos.add(new Pix("Luís", 30, false));
        pagamentos.add(new Boleto("Lis", 50, false));
        pagamentos.add(new CarteiraDigital("Leandro", 124.99, false));

        pagamentos.add(new CartaoDeCredito("Livia", 67, true));
        pagamentos.add(new Pix("Larissa", 12, true));
        pagamentos.add(new Boleto("Luisa", 29.90, true));
        pagamentos.add(new CarteiraDigital("Lorenzo", 45, true));

        for (Pagamento pagamento : pagamentos) {
            ProcessaPagamento.processar(pagamento);
            System.out.println("----------------------");
        }

        ProcessaPagamento.gerarRelatorioFinal();
    }
}
