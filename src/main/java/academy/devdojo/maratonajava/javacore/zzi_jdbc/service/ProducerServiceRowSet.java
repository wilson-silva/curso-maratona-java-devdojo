package academy.devdojo.maratonajava.javacore.zzi_jdbc.service;

import academy.devdojo.maratonajava.javacore.zzi_jdbc.dominio.Producer;
import academy.devdojo.maratonajava.javacore.zzi_jdbc.repository.ProducerRepositoryRowSet;

import java.util.List;

public class ProducerServiceRowSet {
    public static List<Producer> findByNameJdbcRowSet(String name) {
        return ProducerRepositoryRowSet.findByNameJdbcRowSet(name);
    }

    public static void updateJdbcRowSet(Producer producer) {
        ProducerRepositoryRowSet.updateJdbcRowSet(producer);
    }

    public static void updateCachedRowSet(Producer producer) {
        ProducerRepositoryRowSet.updateCachedRowSet(producer);
    }
}
