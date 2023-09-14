package academy.devdojo.maratonajava.javacore.zzk_junit.teste;

import academy.devdojo.maratonajava.javacore.zzk_junit.dominio.Person;
import academy.devdojo.maratonajava.javacore.zzk_junit.service.PersonService;
import lombok.extern.log4j.Log4j2;


@Log4j2
public class PersonServiceTest01 {
    public static void main(String[] args) {
        var person = new Person(15);
        var personService = new PersonService();
        log.info("Is adult? '{}'", personService.isAdult(person));
    }
}
