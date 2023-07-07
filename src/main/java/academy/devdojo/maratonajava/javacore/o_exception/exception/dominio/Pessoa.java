package academy.devdojo.maratonajava.javacore.o_exception.exception.dominio;


import java.io.IOException;

public class Pessoa {

    public void salvar() throws LoginInvalidoException, IOException {
        System.out.println("salvando pessoas");
    }
}
