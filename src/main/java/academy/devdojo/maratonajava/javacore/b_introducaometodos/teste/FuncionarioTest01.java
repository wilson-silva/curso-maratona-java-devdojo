package academy.devdojo.maratonajava.javacore.b_introducaometodos.teste;

import academy.devdojo.maratonajava.javacore.b_introducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.setNome("Sanji");
        funcionario.setIdade(25);
        funcionario.setSalario(new double[]{1200, 987.32, 2000});

        funcionario.imprime();

    }
}
