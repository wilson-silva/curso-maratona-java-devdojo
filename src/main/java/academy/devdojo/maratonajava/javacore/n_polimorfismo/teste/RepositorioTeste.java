package academy.devdojo.maratonajava.javacore.n_polimorfismo.teste;

import academy.devdojo.maratonajava.javacore.n_polimorfismo.repositorio.Repositorio;
import academy.devdojo.maratonajava.javacore.n_polimorfismo.servico.RepositorioArquivo;

public class RepositorioTeste {
    public static void main(String[] args) {
        Repositorio  repositorio = new RepositorioArquivo();
        repositorio.salvar();

    }
}
