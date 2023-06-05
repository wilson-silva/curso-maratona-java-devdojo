package academy.devdojo.maratonajava.javacore.ZZGconcorrencia.teste;

import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TransferQueue;

//Junção da ConcurrentLinkedQueue, SychronousQueue, LinkedBlockingQueue
public class LinkedTransferQueueTest01 {
    public static void main(String[] args) throws InterruptedException {

        TransferQueue<Object> tq = new LinkedTransferQueue<>();
        System.out.println(tq.add("willian"));
        System.out.println(tq.offer("willian"));
        System.out.println(tq.offer("willian", 10, TimeUnit.SECONDS));
        tq.put("DevDojo");
        if(tq.hasWaitingConsumer()){
            tq.transfer("DevDojo");
        }
        System.out.println(tq.tryTransfer("Academy"));
        System.out.println(tq.tryTransfer("Academy", 3, TimeUnit.SECONDS));
        System.out.println(tq.element());
        System.out.println(tq.peek());
        System.out.println(tq.poll());
        System.out.println(tq.remove());
        System.out.println(tq.take());
        System.out.println(tq.remainingCapacity());


    }
}
