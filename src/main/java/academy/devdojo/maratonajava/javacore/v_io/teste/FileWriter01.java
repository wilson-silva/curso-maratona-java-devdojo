package academy.devdojo.maratonajava.javacore.v_io.teste;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

// File
// FileWriter
// FileReader
// BufferWriter
// BufferReader
public class FileWriter01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try(FileWriter fw = new FileWriter(file, true)) {
            fw.write("O devDojo é lindo, é o melhor curso do Brasillllllll\nContinuando a cantoria na proxima linha\n");
            fw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
