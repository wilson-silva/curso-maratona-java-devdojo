package academy.devdojo.maratonajava.javacore.zzi_jdbc.service;

import academy.devdojo.maratonajava.javacore.zzi_jdbc.dominio.Producer;
import academy.devdojo.maratonajava.javacore.zzi_jdbc.repository.ProducerRepository;

public class ProducerService {
    public static void save(Producer producer){
        ProducerRepository.save(producer);
    }

    public static void delete(int id){
        if(id <= 0){
            throw  new IllegalArgumentException("Invalid value for id");
        }
        ProducerRepository.delete(id);
    }

    public static void deleteRange(int start, int end){
        if(start <= 0 && end <=0){
            throw  new IllegalArgumentException("Invalid value for id");
        }
        ProducerRepository.deleteRange(start, end);
    }
}
