package org.example;

public class Philosopher implements Runnable {
    private Object leftFork;
    private Object rightFork;
    public Philosopher(Object leftFork, Object rightFork){       //моделируем философов, каждый может взять вилку слева и справа
        this.leftFork = leftFork;
        this.rightFork = rightFork;
    }

    @Override
    public void run() {
        while (true){
            System.out.println(Thread.currentThread().getName() + " размышляет");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            synchronized(leftFork) {
                System.out.println(Thread.currentThread().getName() + " взял вилку слева");
                synchronized(rightFork) {
                    System.out.println(Thread.currentThread().getName() + " взял вилку справа и начинает есть");
                    System.out.println(Thread.currentThread().getName() + " положил вилку справа");
                }
                System.out.println(Thread.currentThread().getName() + " положил вилку слева и начинает размышлять");
            }
        }
    }
}
