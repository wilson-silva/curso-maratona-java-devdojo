package academy.devdojo.maratonajava.javacore.Hheranca.teste;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Endereco;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Pessoa;

public class HerancaTeste01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("012345-209");

        Pessoa pessoa = new Pessoa("Toyohisa Shimazu");
        pessoa.setCpf("1111111111");
        pessoa.setEndereco(endereco);

        pessoa.imprime();
        System.out.println("--------------------");

        Funcionario funcionario = new Funcionario("Wilson");
        funcionario.setCpf("22222222222");
        funcionario.setSalario(2500);
        funcionario.setEndereco(endereco);

        funcionario.imprime();
    }
}
