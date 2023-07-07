package academy.devdojo.maratonajava.javacore.n_polimorfismo.servico;

import academy.devdojo.maratonajava.javacore.n_polimorfismo.repositorio.Repositorio;

public class RepositorioArquivo implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em um arquivo");
    }
}
