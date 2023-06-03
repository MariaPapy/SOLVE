package org.example;

public class Main {
    public static void main(String[] args) {
        Philosopher[] philosophers = new Philosopher[5];
        Object[] forks = new Object[5];
        for (int i = 0; i < forks.length; i++) {
            forks[i] = new Object();
        }
        for (int i = 0; i < philosophers.length - 1; i++) {
            philosophers[i] = new Philosopher(forks[i], forks[(i + 1) % 5]);
        }
        philosophers[philosophers.length-1] = new Philosopher(forks[0], forks[philosophers.length-1]);
        Thread thread0 = new Thread(philosophers[0], "Первый");
        Thread thread1 = new Thread(philosophers[1], "Второй");
        Thread thread2 = new Thread(philosophers[2], "Третий");
        Thread thread3 = new Thread(philosophers[3], "Четвертый");
        Thread thread4 = new Thread(philosophers[4], "Пятый");
        thread0.start();
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }


}