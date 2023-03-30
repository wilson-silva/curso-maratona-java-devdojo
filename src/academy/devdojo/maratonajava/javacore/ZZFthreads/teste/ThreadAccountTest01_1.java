package academy.devdojo.maratonajava.javacore.ZZFthreads.teste;

import academy.devdojo.maratonajava.javacore.ZZFthreads.dominio.Account;

import java.sql.SQLOutput;

public class ThreadAccountTest01_1 {

    private static final Account account = new Account();

    public static void main(String[] args) {
        new Thread(runnable, "Hestia").start();
        new Thread(runnable, "Bell Cranell").start();
    }

    private static void withdrawal(int amount) {
        System.out.println(getThreadName() + " #### fora do synchronized");
        synchronized (account) {
            System.out.println(getThreadName() + " **** dentro do synchronized");
            if (account.getBalance() >= amount) {
                System.out.println(getThreadName() + " está indo sacar dinheiro");
                account.withdrawal(amount);
                System.out.println(getThreadName() + " completou o saque, valor atual da conta " + account.getBalance());
            } else {
                System.out.println("Sem dinheiro para " + getThreadName() + " efetuar o saque " + account.getBalance());
            }
        }
    }

    private static String getThreadName() {
        return Thread.currentThread().getName();
    }

    private static final Runnable runnable = () -> {
        for (int i = 0; i < 5; i++) {
            withdrawal(10);
        }
        if (account.getBalance() < 0) {
            System.out.println("FODEO");
        }
    };
}
