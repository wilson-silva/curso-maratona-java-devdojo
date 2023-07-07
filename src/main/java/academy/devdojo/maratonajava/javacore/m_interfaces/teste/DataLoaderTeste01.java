package academy.devdojo.maratonajava.javacore.m_interfaces.teste;

import academy.devdojo.maratonajava.javacore.m_interfaces.dominio.DataBaseLoader;
import academy.devdojo.maratonajava.javacore.m_interfaces.dominio.DataLoader;
import academy.devdojo.maratonajava.javacore.m_interfaces.dominio.FileLoader;

public class DataLoaderTeste01 {
    public static void main(String[] args) {

        DataBaseLoader dataBaseLoader = new DataBaseLoader();
        FileLoader fileLoader = new FileLoader();

        dataBaseLoader.load();
        fileLoader.load();

        dataBaseLoader.remove();
        fileLoader.remove();

        dataBaseLoader.checkPermission();
        fileLoader.checkPermission();

        DataLoader.retrieveMaxDataSize();
        DataBaseLoader.retrieveMaxDataSize();


    }
}
