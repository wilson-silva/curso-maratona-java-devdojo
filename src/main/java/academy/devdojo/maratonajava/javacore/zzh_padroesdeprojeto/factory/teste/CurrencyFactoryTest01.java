package academy.devdojo.maratonajava.javacore.zzh_padroesdeprojeto.factory.teste;

import academy.devdojo.maratonajava.javacore.zzh_padroesdeprojeto.factory.dominio.Country;
import academy.devdojo.maratonajava.javacore.zzh_padroesdeprojeto.factory.dominio.Currency;
import academy.devdojo.maratonajava.javacore.zzh_padroesdeprojeto.factory.dominio.ConcreteCurrencyFactory;

public class CurrencyFactoryTest01 {
    public static void main(String[] args) {
        Currency currency1 = ConcreteCurrencyFactory.newCurrency(Country.BRAZIL);
        System.out.println(currency1.getSymbol());

        Currency currency2 = ConcreteCurrencyFactory.newCurrency(Country.USA);
        System.out.println(currency2.getSymbol());
    }

}
