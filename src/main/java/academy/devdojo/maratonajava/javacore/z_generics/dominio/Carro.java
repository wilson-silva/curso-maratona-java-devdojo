package academy.devdojo.maratonajava.javacore.z_generics.dominio;

public class Carro
{

    private String nome;

    public Carro(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
