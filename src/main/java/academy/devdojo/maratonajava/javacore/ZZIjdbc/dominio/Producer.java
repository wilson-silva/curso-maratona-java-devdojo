package academy.devdojo.maratonajava.javacore.ZZIjdbc.dominio;

<<<<<<< HEAD
import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class Producer {
    private Integer id;
    private String name;
=======
import java.util.Objects;

public class Producer {
    private Integer id;
    private String name;


    public static final class ProducerBuilder {
        private Integer id;
        private String name;

        private ProducerBuilder() {
        }

        public static ProducerBuilder builder() {
            return new ProducerBuilder();
        }

        public ProducerBuilder id(Integer id) {
            this.id = id;
            return this;
        }

        public ProducerBuilder name(String name) {
            this.name = name;
            return this;
        }

        public Producer build() {
            Producer producer = new Producer();
            producer.id = this.id;
            producer.name = this.name;
            return producer;
        }
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Producer producer = (Producer) o;
        return Objects.equals(id, producer.id) && Objects.equals(name, producer.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
>>>>>>> 3d818a4310995a62feaad1760d7dff21af63153f
}