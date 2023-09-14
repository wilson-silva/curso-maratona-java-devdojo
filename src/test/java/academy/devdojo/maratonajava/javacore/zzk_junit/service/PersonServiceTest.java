package academy.devdojo.maratonajava.javacore.zzk_junit.service;

import academy.devdojo.maratonajava.javacore.zzk_junit.dominio.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonServiceTest {

    @Test
    @DisplayName("A person should be not adult when age is lower than 18")
    void isAdult_ReturnFalse_WhenAgeIsLowerThan18() {
        Person person = new Person(15);
        PersonService personService = new PersonService();
        assertFalse(personService.isAdult(person));
    }

    @Test
    @DisplayName("A person should be adult when age is higher than 18")
    void isAdult_ReturnTrue_WhenAgeIsHigherOrEqualThan18() {
        Person person = new Person(18);
        PersonService personService = new PersonService();
        assertTrue(personService.isAdult(person));
    }
}