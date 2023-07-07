package academy.devdojo.maratonajava.javacore.s_formatacao.teste;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest01 {
    public static void main(String[] args) {
        Locale localeUS = Locale.US;
        Locale localBR = new Locale("pt", "BR");
        Locale localJP = Locale.JAPAN;
        Locale localIT = Locale.ITALIAN;
        NumberFormat[] nfa = new NumberFormat[4];
        nfa[0] = NumberFormat.getInstance(localeUS);
        nfa[1] = NumberFormat.getInstance(localJP);
        nfa[2] = NumberFormat.getInstance(localBR);
        nfa[3] = NumberFormat.getInstance(localIT);
        double valor =  1_000.2130;
        for (NumberFormat numberFormat : nfa) {
            numberFormat.setMaximumFractionDigits(2);
            System.out.println(numberFormat.format(valor));
        }
        String valorString = "1000.2130";
        try {
            System.out.println(nfa[0].parse(valorString));
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
