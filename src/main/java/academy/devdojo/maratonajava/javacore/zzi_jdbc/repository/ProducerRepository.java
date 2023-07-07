package academy.devdojo.maratonajava.javacore.zzi_jdbc.repository;

import academy.devdojo.maratonajava.javacore.zzi_jdbc.conn.ConnectionFactory;
import academy.devdojo.maratonajava.javacore.zzi_jdbc.dominio.Producer;
import lombok.extern.log4j.Log4j2;



import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

@Log4j2
public class ProducerRepository {
    public static void save(Producer producer) {
        String sql = "INSERT INTO `anime_store`.`producer` (`name`) VALUES ('%s');".formatted(producer.getName());
        try (Connection connection = ConnectionFactory.getConnection();
             Statement stmt = connection.createStatement()) {
            int rowsAffected = stmt.executeUpdate(sql);
            log.info("Inserted producer '{}' in the database, rows affected '{}'",producer.getName(), rowsAffected);
        } catch (SQLException e) {
            log.error("Error while trying to insert producer '{}'", producer.getName(), e);
        }
    }
    //----------------------------------------------------------------------------------------------------------------

    public static void deleteRange(int start, int end) {
        String sql = "DELETE FROM `anime_store`.`producer` WHERE `id` >= %d AND `id` <= %d;".formatted(start, end);
        try (Connection connection = ConnectionFactory.getConnection();
             Statement stmt = connection.createStatement()) {
            int rowsAffected = stmt.executeUpdate(sql);
            log.info("Deleted producer '{}' to '{}' from the database, rows affected '{}'",start, end, rowsAffected);
        } catch (SQLException e) {
            log.error("Error while trying to delete producer '{}' to '{}'", start, end, e);
        }
    }
    //----------------------------------------------------------------------------------------------------------------

    public static void delete(int id) {
        String sql = "DELETE FROM `anime_store`.`producer` WHERE (`id` = %d);".formatted(id);
        try (Connection connection = ConnectionFactory.getConnection();
             Statement stmt = connection.createStatement()) {
            int rowsAffected = stmt.executeUpdate(sql);
            log.info("Deleted producer '{}' from the database, rows affected '{}'",id, rowsAffected);
        } catch (SQLException e) {
            log.error("Error while trying to delete producer '{}'", id, e);
        }
    }
}
