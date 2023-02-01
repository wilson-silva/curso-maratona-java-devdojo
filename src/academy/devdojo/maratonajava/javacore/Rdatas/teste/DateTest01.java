package academy.devdojo.maratonajava.javacore.Rdatas.teste;

import java.util.Date;

public class DateTest01 {
    public static void main(String[] args) {
        //Já obsoleta
        Date date = new Date(1_000_000_000);
        date.setTime(date.getTime() + 3_600_000);
        System.out.println(date);
    }
}
