package academy.devdojo.maratonajava.javacore.zzi_jdbc.teste;

import academy.devdojo.maratonajava.javacore.zzi_jdbc.dominio.Producer;
import academy.devdojo.maratonajava.javacore.zzi_jdbc.service.ProducerService;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class ConnectionFactoryTest01 {
    public static void main(String[] args) {
        Producer producer = Producer.builder()
                .name("Studio Deen")
                .build();

        //ProducerService.save(producer);

        //ProducerService.delete(10);
        //ProducerService.delete(3);

        //ProducerService.deleteRange(3, 12);


    }
}
