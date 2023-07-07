package academy.devdojo.maratonajava.javacore.y_colecoes.teste;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListaArrayConversaoTest01 {
    public static void main(String[] args) {
        System.out.println("Conversão de List para Array usando toArray");
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);

        Integer[] listToArray = numeros.toArray(new Integer[0]);
        numeros.forEach(System.out::println);
        System.out.println();
        System.out.println(Arrays.toString(listToArray));

        System.out.println("------------------------");
        System.out.println("Conversão de Array para List usando Arrays.asList");
        Integer[] numerosArray = new Integer[3];
        numerosArray[0] = 1;
        numerosArray[1] = 2;
        numerosArray[2] = 3;

        List<Integer> arrayToList = Arrays.asList(numerosArray);
        arrayToList.set(0,12); //altera também a array original
        //arrayToList.add(15); //ao tentar add um valor lançara excessão por conta do Arrays.asList
        System.out.println(Arrays.toString(numerosArray));
        System.out.println();
        arrayToList.forEach(System.out::println);

        System.out.println("------------------------");
        System.out.println("Conversão de Array para List corrigindo versão anterior");
        List<Integer> numeroList = new ArrayList<>(Arrays.asList(numerosArray));

        System.out.println("Lista antes da alteração: " + numeroList.toString());
        numeroList.set(0, 21);
        numeroList.add(15);

        System.out.println("Array Original: " + Arrays.toString(numerosArray));
        System.out.println("Lista após alteração:" + numeroList.toString());

        System.out.println("------------------------");






    }
}
