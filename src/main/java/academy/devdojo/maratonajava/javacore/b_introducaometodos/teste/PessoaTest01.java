package academy.devdojo.maratonajava.javacore.b_introducaometodos.teste;

import academy.devdojo.maratonajava.javacore.b_introducaometodos.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        pessoa.setNome("Jiraya");
        pessoa.setIdade(70);
        pessoa.imprime();

    }
}
