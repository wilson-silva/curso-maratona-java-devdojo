package academy.devdojo.maratonajava.javacore.s_formatacao.teste;



import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTimeFormatterTest01 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        String s1 = date.format(DateTimeFormatter.BASIC_ISO_DATE);
        String s2 = date.format(DateTimeFormatter.ISO_DATE);
        String s3 = date.format(DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println();

        LocalDate parse1 = LocalDate.parse("20211026", DateTimeFormatter.BASIC_ISO_DATE);
        LocalDate parse2 = LocalDate.parse("2021-10-26", DateTimeFormatter.ISO_DATE);
        LocalDate parse3 = LocalDate.parse("2021-10-26", DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(parse1);
        System.out.println(parse2);
        System.out.println(parse3);
        System.out.println();

        LocalDateTime now = LocalDateTime.now();
        String s4 = now.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(s4);
        LocalDateTime parse4 = LocalDateTime.parse("2021-10-27T00:03:51.0132342");
        System.out.println(parse4);

        //dd/MM/yyyy (Brasil)
        //MM/dd/yyyy (US)
        //yyyy/MM/dd (JA)
        DateTimeFormatter formatterBR = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formatBR = LocalDate.now().format(formatterBR);
        System.out.println(formatBR);
        LocalDate parseBR = LocalDate.parse("27/10/2021", formatterBR);
        System.out.println(parseBR);
        System.out.println();

        DateTimeFormatter formatterGR = DateTimeFormatter.ofPattern("dd.MMMM.yyyy", Locale.GERMAN);
        String formatGR = LocalDate.now().format(formatterGR);
        System.out.println(formatGR);
        LocalDate parseGR = LocalDate.parse("27.Oktober.2021", formatterGR);
        System.out.println(parseGR);

    }
}
