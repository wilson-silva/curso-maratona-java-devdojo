package academy.devdojo.maratonajava.javacore.Zgenerics.teste;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Consumidor;

import java.util.ArrayList;
import java.util.List;

public class GenericTest01 {
    public static void main(String[] args) {
        /*
        O JDK 5.0 introduziu o Java Generics com o objetivo de reduzir bugs e adicionar uma camada extra de
        abstração sobre os tipos.

        O generic funciona apenas em tempo de compilação para poder restringir
        a lista para um unico tipo, o bytecode envia para
        a JVM desta forma "List lista = new ArrayList();" que era usada até a versão 4,
        desta forma se mantem a compatibilidade com sistemas que estão utilizando Java.
        Este processo é chamado de Type erasure - apaga o tipo depois que o codigo é compilado.
         */
        List<String> lista = new ArrayList<>();
        lista.add("Midorya");
        lista.add("Midorya");

        for (String o : lista) {
            System.out.println(o);
        }

        add(lista, new Consumidor("Midorya"));

        /*
        Ao adicionar este for dará ClassCastException, erro na linha 32, pois em tempo de
        compilação é validado o tipo da lista e como a lista é de String e não Consumidor
        lança a exceção, se trocarmos o String por Object ele funciona.
        */
        for (Object o : lista) {
            System.out.println(o);
        }

    }
    private static void add(List lista, Consumidor consumidor){
        lista.add(consumidor);
    }
}
