package academy.devdojo.maratonajava.javacore.Wnio.teste;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

class ListJavaFile extends SimpleFileVisitor<Path> {

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
        if (file.getFileName().toString().endsWith(".java")) {
            System.out.println(file.getFileName());
        }

        return FileVisitResult.CONTINUE;
    }
}

public class SimpleFileVisitorTest01 {

    public static void main(String[] args) throws IOException {

        Path root = Paths.get(".");
        Files.walkFileTree(root, new ListJavaFile());

    }
}
