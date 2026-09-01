package exerciciosjava.POO05.test;

import exerciciosjava.POO05.dominio.Funcionario;

public class FuncionarioTeste01 {
    public static void main(String[] args) {
        Funcionario funcionario01 = new Funcionario("Kaleb Ferreira", 25, "01223624589", "Desenvolvedor Júnior", 4500);
        System.out.println(funcionario01);
        Funcionario funcionario02 = new Funcionario("Luís Otávio", 18, "01223624589", "Jovem Aprendiz", 1600);
        Funcionario funcionario03 = new Funcionario("Kaleb Ferreira", 25, "01223624589", "Gerente de TI", 7500);
        Funcionario funcionario04 = new Funcionario("Kaleb Ferreira", 25, "99999999999", "Gerente de TI", 7500);

        funcionario01.imprimirDados();
        funcionario02.imprimirDados();

        System.out.println(funcionario01.equals(funcionario03));
        System.out.println(funcionario01.equals(funcionario02));
        System.out.println(funcionario03.equals(funcionario04));

        System.out.println(funcionario01.hashCode());
        System.out.println(funcionario03.hashCode());
        System.out.println(funcionario02.hashCode());
        System.out.println(funcionario04.hashCode());
    }
}
