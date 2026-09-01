package exerciciosjava.POO05.dominio;

import java.util.Objects;

public class Funcionario {
    private String nome;
    private int idade;
    private String cpf;
    private String cargo;
    private double salario;

    public Funcionario(String nome, int idade, String cpf, String cargo, double salario) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.cargo = cargo;
        this.salario = salario;

        if (idade < 18) {
            throw new IllegalArgumentException("O funcionário deve ter no mínimo 18 anos. Idade informada: " + idade);
        }
    }

    public void imprimirDados() {
        System.out.println("DADOS DO FUNCIONÁRIO:" + "\n" +
                "Nome: " + nome + "\n" +
                "Idade: " + idade + "anos \n" +
                "CPF: " + cpf + "\n" +
                "Cargo: " + cargo + "\n" +
                "Salário: R$ " + String.format("%.2f", salario) + "\n" +
                "--------------------------");
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Funcionario that = (Funcionario) o;
        return idade == that.idade && Objects.equals(nome, that.nome) && Objects.equals(cpf, that.cpf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, idade, cpf);
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", Cpf='" + cpf + '\'' +
                ", cargo='" + cargo + '\'' +
                ", salario=" + salario +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getCpf() {
        return cpf;
    }

    public String getCargo() {
        return cargo;
    }

    public double getSalario() {
        return salario;
    }
}
