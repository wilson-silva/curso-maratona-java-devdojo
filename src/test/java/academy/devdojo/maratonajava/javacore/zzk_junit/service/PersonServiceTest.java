package academy.devdojo.maratonajava.javacore.zzk_junit.service;

import academy.devdojo.maratonajava.javacore.zzk_junit.dominio.Person;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PersonServiceTest {
    private Person adult;
    private Person notAdult;
    private PersonService personService;
    @BeforeEach
    public void setup(){
        adult = new Person(18);
        notAdult = new Person(15);
        personService = new PersonService();
    }

    @Test
    @DisplayName("A person should be not adult when age is lower than 18")
    void isAdult_ReturnFalse_WhenAgeIsLowerThan18() {
        assertFalse(personService.isAdult(notAdult));
    }

    @Test
    @DisplayName("A person should be adult when age is greather or equals than 18")
    void isAdult_ReturnTrue_WhenAgeIsGreatherOrEqualsThan18() {;
        assertTrue(personService.isAdult(adult));
    }

    @Test
    @DisplayName("should throw NullPointerException with message when person is null")
    void isAdult_ShouldThrowException_WhenPersonIsNull() {
        var ex = assertThrows(NullPointerException.class, () -> personService.isAdult(null),
                "Person must be null");
        assertEquals("Person can´t be null", ex.getMessage());
    }

    @Test
    @DisplayName("should return list with only adults ")
    void filterRemovingNotAdult_ReturnListWithAdultOnly_WhenListOfPersonWithAdultIsPassed() {
        Person person1 = new Person(17);
        Person person2 = new Person(18);
        Person person3 = new Person(21);
        var personList = List.of(person1, person2, person3);
        assertEquals(2, personService.filterRemovingNotAdult(personList).size());
    }
}