package academy.devdojo.maratonajava.javacore.x_serializacao.teste;

import academy.devdojo.maratonajava.javacore.x_serializacao.dominio.Aluno;
import academy.devdojo.maratonajava.javacore.x_serializacao.dominio.Turma;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SerializacaoTest01 {
    public static void main(String[] args) {

        Aluno aluno = new Aluno(1L, "Wilson G Silva", "111222333");
        Turma turma = new Turma("Maratona no Jiraya em Breve Ricos");
        aluno.setTurma(turma);
        serializar(aluno);
        deserializar();
    }

    private static void serializar(Aluno aluno){
        Path path = Paths.get("pasta/aluno.ser");
        try(ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(path))){
            oos.writeObject(aluno);
        }catch (IOException e){
           e.printStackTrace();
        }
    }

    private static void deserializar() {
        Path path = Paths.get("pasta/aluno.ser");
        try (ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(path))){
            Aluno aluno = (Aluno) ois.readObject();
            System.out.println(aluno);
        }catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
