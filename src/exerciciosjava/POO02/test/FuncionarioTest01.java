package exerciciosjava.POO02.test;

import exerciciosjava.POO02.dominio.*;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Assalariado assalariado = new Assalariado("Raul", "Desenvolvedor Java Pleno", 7000);
        Comissionado comissionado = new Comissionado("Heitor", "Vendedor", 8000, 0.15);
        Horista horista01 = new Horista("Pedro", "Gestor de Tráfego", 30, 40);
        Horista horista02 = new Horista("Ravi", "Social Media", 30, 30, 5, 45);
        ComissionadoComSalarioBase comissionado02 = new ComissionadoComSalarioBase("Endrick", "Vendedor Pleno", 9000, 0.15, 3000);

        Funcionario[] funcionarios = {assalariado, comissionado, horista01, horista02, comissionado02};

        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario);
            double valorRecebido = funcionario.vencimentos();

            if (funcionario instanceof ComissionadoComSalarioBase) {
                ComissionadoComSalarioBase funcionarioComBonus = (ComissionadoComSalarioBase) funcionario;
                valorRecebido = funcionarioComBonus.aplicarBonus();
            }

            System.out.println("Valor a ser recebido: R$ " + valorRecebido);

            System.out.println("--- ".repeat(15));

        }
    }
}
