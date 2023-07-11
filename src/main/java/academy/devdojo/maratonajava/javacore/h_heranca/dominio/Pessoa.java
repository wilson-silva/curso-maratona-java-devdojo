package academy.devdojo.maratonajava.javacore.h_heranca.dominio;

/**
 * Protected pode ser acesso por classes no mesmo pacote ou por classes que
 * são extendidas pela classe pai.
 */

public class Pessoa {
   protected String nome;
   protected String cpf;
   protected Endereco endereco;

   static{
       System.out.println("Dentro do bloco de inicialização estático de pessoa");
   }

   {
        System.out.println("Dentro do bloco inicialização de pessoa 1");
   }

    {
        System.out.println("Dentro do bloco inicialização de pessoa 2");
    }

    public Pessoa(String nome) {
        System.out.println("Dentro do construtor de pessoa");
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.cpf);
        if(endereco != null){
            System.out.println(this.endereco.getRua() + ", " + this.endereco.getCep());
        }
    }
}