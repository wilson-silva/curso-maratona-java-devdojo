package academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.factory.teste;

import academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.factory.dominio.Country;
import academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.factory.dominio.Currency;
import academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.factory.dominio.CurrencyFactory;

public class CurrencyFactoryTest01 {
    public static void main(String[] args) {
        Currency currency = CurrencyFactory.newCurrency(Country.BRAZIL);
        System.out.println(currency.getSymbol());

        Currency currency2 = CurrencyFactory.newCurrency(Country.USA);
        System.out.println(currency2.getSymbol());
    }

}
