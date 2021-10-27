package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.*;
import java.time.chrono.JapaneseDate;
import java.util.Map;

public class ZoneTest01 {
    public static void main(String[] args) {

        Map<String, String> shortIds = ZoneId.SHORT_IDS;
        System.out.println(shortIds);
        System.out.println();

        System.out.println(ZoneId.systemDefault());
        System.out.println();

        ZoneId tokyoZone = ZoneId.of("Asia/Tokyo");
        System.out.println(tokyoZone);
        System.out.println();

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        System.out.println();

        ZonedDateTime zonedDateTime = now.atZone(tokyoZone);
        System.out.println(zonedDateTime);
        System.out.println();

        Instant nowInstant = Instant.now();
        System.out.println(nowInstant);
        ZonedDateTime zonedDateTime2 = nowInstant.atZone(tokyoZone);
        System.out.println(zonedDateTime2);
        System.out.println();

        System.out.println(ZoneOffset.MIN);
        System.out.println(ZoneOffset.MAX);
        System.out.println();

        ZoneOffset offsetManaus = ZoneOffset.of("-04:00");
        OffsetDateTime offsetDateTime = now.atOffset(offsetManaus);
        System.out.println(offsetDateTime);
        OffsetDateTime offsetDateTime2 = OffsetDateTime.of(now, offsetManaus);
        System.out.println(offsetDateTime2);
        System.out.println();

        OffsetDateTime offsetDateTime3 = nowInstant.atOffset(offsetManaus);
        System.out.println(offsetDateTime3);
        System.out.println();

        JapaneseDate japaneseDate = JapaneseDate.from(LocalDate.now());
        System.out.println(japaneseDate);
        LocalDate meijiEraLocalDate = LocalDate.of(1900, 2, 1);
        JapaneseDate meijiEra = japaneseDate.from(meijiEraLocalDate);
        System.out.println(meijiEra);
    }
}
