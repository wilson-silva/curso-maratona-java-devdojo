package academy.devdojo.maratonajava.javacore.Gassociacao.teste;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Contato;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Endereco;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Telefone;

public class Teste {
    public static void main(String[] args) {
        Contato contato = new Contato();
        contato.setNome("Tyrion");

        //relacionamento tem-um endereco
        Endereco endereco = new Endereco("Rua Game of thrones", "na", "-",
                "99999", "Kings Landings", "Westeros");
        contato.setEndereco(endereco);

        //relacionamento tem-um telefone
        Telefone telefone1 = new Telefone("celular", "11", "9999-9999" );
        Telefone telefone2 = new Telefone("casa", "11", "8888-9999" );
        Telefone[] telefones = {telefone1, telefone2};
        contato.setTelefone(telefones);


        //Teste saída no console
        System.out.println(contato.getNome());
        if(contato != null && contato.getEndereco() != null){
            System.out.println(contato.getEndereco().getCidade());
        }
        if(contato != null && contato.getTelefone() != null ){
            for (Telefone telefone : telefones)
            System.out.println(telefone.getDdd() + " " + telefone.getNumero());
        }
    }
}
