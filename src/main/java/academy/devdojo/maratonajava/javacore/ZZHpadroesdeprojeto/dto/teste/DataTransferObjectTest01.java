package academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.dto.teste;

import academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.build.dominio.Person;
import academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.dto.dominio.ReportDto;
import academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.factory.dominio.ConcreteCurrencyFactory;
import academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.factory.dominio.Country;
import academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.singleton.dominio.Aircraft;

public class DataTransferObjectTest01 {
    public static void main(String[] args) {
        var aircraft = new Aircraft("777");
        var country = Country.BRAZIL;
        var currency = ConcreteCurrencyFactory.newCurrency(country);
        var person = Person.PersonBuilder.builder()
                .firstName("Wilson")
                .lastName("Silva")
                .build();

        ReportDto reportDto = ReportDto.ReportDtoBuilder
                .builder()
                .aircraftName(aircraft.getName())
                .country(country)
                .currency(currency.getSymbol())
                .personName(person.getFirstName())
                .build();

        System.out.println(reportDto);

    }
}
