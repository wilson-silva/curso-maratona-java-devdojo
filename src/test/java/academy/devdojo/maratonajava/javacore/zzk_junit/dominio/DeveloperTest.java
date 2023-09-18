package academy.devdojo.maratonajava.javacore.zzk_junit.dominio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeveloperTest {

    @Test
    public void instanceOfExecutesChildClassMethodWhenObjectIsOfChildType(){
        Employee employeeDeveloper = new Developer("1", "Java");
        if(employeeDeveloper instanceof Developer){
            Developer developer = (Developer) employeeDeveloper;
            assertEquals("Java", developer.getMainLanguage());
        }

        if(employeeDeveloper instanceof Developer developer){
            assertEquals("Java", developer.getMainLanguage());
        }
    }

}