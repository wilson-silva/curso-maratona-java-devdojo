package academy.devdojo.maratonajava.javacore.zzi_jdbc.service;

import academy.devdojo.maratonajava.javacore.zzi_jdbc.dominio.Producer;
import academy.devdojo.maratonajava.javacore.zzi_jdbc.repository.ProducerRepository;

import java.util.List;

public class ProducerService {
    public static void save(Producer producer) {
        ProducerRepository.save(producer);
    }

    public static void delete(Integer id) {
        requireValidId(id);
        ProducerRepository.delete(id);
    }

    public static void deleteRange(int start, int end) {
        if (start <= 0 && end <= 0) {
            throw new IllegalArgumentException("Invalid value for id");
        }
        ProducerRepository.deleteRange(start, end);
    }

    public static void update(Producer producer) {
        requireValidId(producer.getId());
        ProducerRepository.update(producer);
    }

    public static List<Producer> findAll() {
       return ProducerRepository.findAll();
    }

    private static void requireValidId(Integer id) {
        if (id == null || id <= 0) {
            throw new IllegalArgumentException("Invalid value for id");
        }
    }


}
