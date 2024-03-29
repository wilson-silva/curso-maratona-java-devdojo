package academy.devdojo.maratonajava.javacore.zzi_jdbc.teste;

import academy.devdojo.maratonajava.javacore.zzi_jdbc.dominio.Producer;
import academy.devdojo.maratonajava.javacore.zzi_jdbc.service.ProducerService;
import lombok.extern.log4j.Log4j2;

import java.util.List;

@Log4j2
public class ConnectionFactoryTest01 {
    public static void main(String[] args) {
        Producer producer = Producer.builder().name("Studio Deen").build();
        Producer producerToUpdate = Producer.builder().id(14).name("BoNeS").build();
//        ProducerService.save(producer);
//        ProducerService.delete(10);
//        ProducerService.delete(3);
//        ProducerService.deleteRange(3, 12);
//        ProducerService.update(producerToUpdate);
//        List<Producer> producers = ProducerService.findAll();
//        log.info("Producers found '{}'", producers);
//        List<Producer> producers2 = ProducerService.findByName("NHK");
//        log.info("Producers found '{}'", producers2);
//        ProducerService.showProducerMetaData();
//        ProducerService.showDriverMetaData();
//        ProducerService.showTypeScrollWorking();
//        List<Producer> deen = ProducerService.findByNameAndUpdateToUpperCase("mad");
//        List<Producer> producers = ProducerService.findByNameAndInsertWhenNotFound("A-1 pictures");
//        log.info("Producers found '{}'", producers);
//         ProducerService.findByNameAndDelete("Bones");
//        List<Producer> producers = ProducerService.findByNamePreparedStatement("Bon");
//        log.info("Producers found '{}'", producers);
//        ProducerService.updatePreparedStatement(producerToUpdate);

        List<Producer> producers = ProducerService.findByNameCallableStatement("Bon");
        log.info("Producers found '{}'", producers);


    }
}
