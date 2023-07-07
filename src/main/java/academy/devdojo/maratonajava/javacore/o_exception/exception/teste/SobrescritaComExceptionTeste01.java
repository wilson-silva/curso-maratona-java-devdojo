package academy.devdojo.maratonajava.javacore.o_exception.exception.teste;

import academy.devdojo.maratonajava.javacore.o_exception.exception.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.o_exception.exception.dominio.LoginInvalidoException;
import academy.devdojo.maratonajava.javacore.o_exception.exception.dominio.Pessoa;

import java.io.FileNotFoundException;


public class SobrescritaComExceptionTeste01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

        try {
            funcionario.salvar();
        } catch (LoginInvalidoException | FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
