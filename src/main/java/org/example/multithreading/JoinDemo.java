package org.example.multithreading;

public class JoinDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new JoinDemoThread();
        thread.start();
        thread.join();
        System.out.println("Main Thread continues after join thread is done");
        System.out.println(Thread.currentThread().getName());
    }
}
