package academy.devdojo.maratonajava.javacore.zzi_jdbc.teste;

import academy.devdojo.maratonajava.javacore.zzi_jdbc.dominio.Producer;
import academy.devdojo.maratonajava.javacore.zzi_jdbc.service.ProducerServiceRowSet;
import lombok.extern.log4j.Log4j2;

import java.util.List;

@Log4j2
public class ConnectionFactoryTest02 {
    public static void main(String[] args) {

        Producer producerToUpdate = Producer.builder().id(1).name("madhouse").build();

        ProducerServiceRowSet.updateJdbcRowSet(producerToUpdate);

        log.info("-------------------------------------");

        List<Producer> producers = ProducerServiceRowSet.findByNameJdbcRowSet("");
        log.info(producers);



    }
}
