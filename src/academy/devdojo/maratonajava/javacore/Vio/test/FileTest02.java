package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.IOException;

public class FileTest02 {
    public static void main(String[] args) throws IOException {
        File fileDiretorio = new File("pasta");
        boolean isDiretorioCreated = fileDiretorio.mkdir();
        System.out.println("Pasta criada? " + isDiretorioCreated);

        File fileArquivoDiretorio = new File(fileDiretorio, "arquivo.txt");

        boolean isFileCreated = fileArquivoDiretorio.createNewFile();
        System.out.println("Arquivo.txt criado? " + isFileCreated);

        File fileRename = new File(fileDiretorio, "arquivo_renomeado.txt");
        boolean isRename = fileArquivoDiretorio.renameTo(fileRename);
        System.out.println("arquivo.txt renomeado " + isRename);

        File diretorioRenamed = new File("pasta2");
        boolean isDiretorioRenomeado = fileDiretorio.renameTo(diretorioRenamed);
        System.out.println("Diretorio pasta renomeado " + isDiretorioRenomeado);


    }
}
