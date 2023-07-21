package academy.devdojo.maratonajava.javacore.zzi_jdbc.repository;

import academy.devdojo.maratonajava.javacore.zzi_jdbc.conn.ConnectionFactory;
import academy.devdojo.maratonajava.javacore.zzi_jdbc.dominio.Producer;

import javax.sql.rowset.JdbcRowSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProducerRepositoryRowSet {
    public static List<Producer> findByNameJdbcRowSet(String name) {
        String sql = "SELECT * FROM anime_store.producer WHERE name like ?;";
        List<Producer> producers = new ArrayList<>();
        try (JdbcRowSet jrs = ConnectionFactory.getJdbcRowSet()) {
            jrs.setCommand(sql);
            jrs.setString(1, String.format("%%%s%%", name));
            jrs.execute(); //usado apenas para buscar dados
            while (jrs.next()) {
                Producer producer = Producer.builder()
                        .id(jrs.getInt("id"))
                        .name(jrs.getString("name"))
                        .build();
                producers.add(producer);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return producers;
    }
}
