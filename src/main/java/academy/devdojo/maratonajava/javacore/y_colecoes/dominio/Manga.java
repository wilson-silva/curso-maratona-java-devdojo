package academy.devdojo.maratonajava.javacore.y_colecoes.dominio;

import java.util.Objects;

public class Manga implements Comparable<Manga> {
    private Long id;
    private String nome;
    private double preco;
    private int quantidade;
    //--------------------------------------------------------------------------

    public Manga(Long id, String nome, double preco) {
        Objects.requireNonNull(id, "Id não pode ser nulo");
        Objects.requireNonNull(nome, "nome não pode ser nulo");
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    public Manga(Long id, String nome, double preco, int quantidade) {
        this(id, nome, preco);
        this.quantidade = quantidade;
    }

    //--------------------------------------------------------------------------

    @Override
    public String toString() {
        return "Manga{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }

    //--------------------------------------------------------------------------

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Manga manga = (Manga) o;
        return Objects.equals(id, manga.id) && Objects.equals(nome, manga.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome);
    }

    //--------------------------------------------------------------------------


    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    //--------------------------------------------------------------------------
    @Override
    public int compareTo(Manga o) {

        //Usado quando o atributo a ser comparado não for um objeto que implementa comparable
        /*
        if(this.id < o.getId()){
            return -1;
        } else if (this.id.equals(o.getId())) {
            return  0;
        }
        return 1;
         */
        //--------------------------------------------------------------------------

        // Usado direto pois as classes Wrapper implementam Comparable
        //return this.id.compareTo(o.getId());
        //--------------------------------------------------------------------------

        // Usado direto porém convertendo o double(primitivo) para Double(Wrapper)
        //return Double.valueOf(preco).compareTo(o.getPreco());
        //return Double.compare(preco, o.getPreco());

        //--------------------------------------------------------------------------

        // Ordenando pelo nome
        return this.nome.compareTo(o.getNome());
    }

}
