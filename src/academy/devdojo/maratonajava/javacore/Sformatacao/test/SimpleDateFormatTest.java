package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest {
    public static void main(String[] args) {
        //String pattern = "yyyy.MM.dd G 'at' HH:mm:ss z";
        String pattern1 = "'Bragança' dd 'de' MMMM 'de' yyyy";
        SimpleDateFormat sdf = new SimpleDateFormat(pattern1);
        System.out.println(sdf.format(new Date()));

    }
}
