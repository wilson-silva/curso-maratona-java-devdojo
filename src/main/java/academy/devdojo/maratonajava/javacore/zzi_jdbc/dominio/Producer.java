package academy.devdojo.maratonajava.javacore.zzi_jdbc.dominio;


import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class Producer {
    Integer id;
    String name;

}
