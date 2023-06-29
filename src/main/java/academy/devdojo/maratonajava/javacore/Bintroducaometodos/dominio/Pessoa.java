package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Pessoa {

    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void imprime(){
        System.out.println(this.nome);
        if(getIdade() < 0){
            System.out.println("Idade inválida");
        }else {
            System.out.println(this.idade);
        }
    }
}
