package academy.devdojo.maratonajava.javacore.ZZIjdbc.repository;

import academy.devdojo.maratonajava.javacore.ZZIjdbc.conn.ConnectionFactory;
import academy.devdojo.maratonajava.javacore.ZZIjdbc.dominio.Producer;
<<<<<<< HEAD
import lombok.extern.log4j.Log4j2;
=======
>>>>>>> 3d818a4310995a62feaad1760d7dff21af63153f

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

<<<<<<< HEAD
@Log4j2
=======
>>>>>>> 3d818a4310995a62feaad1760d7dff21af63153f
public class ProducerRepository {
    public static void save(Producer producer) {
        String sql = "INSERT INTO `anime_store`.`producer` (`name`) VALUES ('%s');".formatted(producer.getName());
        try (Connection connection = ConnectionFactory.getConnection();
             Statement stmt = connection.createStatement()) {
            int rowsAffected = stmt.executeUpdate(sql);
<<<<<<< HEAD
            log.info("Inserted producer in the database, rows affected '{}'", rowsAffected);
=======
            System.out.println(rowsAffected);
>>>>>>> 3d818a4310995a62feaad1760d7dff21af63153f
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
