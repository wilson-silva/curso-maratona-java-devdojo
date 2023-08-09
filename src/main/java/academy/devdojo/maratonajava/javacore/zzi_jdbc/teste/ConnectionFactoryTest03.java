package academy.devdojo.maratonajava.javacore.zzi_jdbc.teste;

import academy.devdojo.maratonajava.javacore.zzi_jdbc.dominio.Producer;
import academy.devdojo.maratonajava.javacore.zzi_jdbc.service.ProducerService;
import academy.devdojo.maratonajava.javacore.zzi_jdbc.service.ProducerServiceRowSet;
import lombok.extern.log4j.Log4j2;

import java.util.List;

@Log4j2
public class ConnectionFactoryTest03 {
    public static void main(String[] args) {

        Producer producer1 = Producer.builder().id(1).name("Toei Animation").build();
        Producer producer2 = Producer.builder().id(2).name("White Fox").build();
        Producer producer3 = Producer.builder().id(3).name("Studio Ghibli").build();

        ProducerService.saveTransaction(List.of(producer1, producer2, producer3));



    }
}
