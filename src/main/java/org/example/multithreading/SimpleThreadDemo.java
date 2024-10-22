package org.example.multithreading;

public class SimpleThreadDemo
{
    public static void main(String[] args) {
        SimpleThread thread = new SimpleThread();
        thread.start();
        System.out.println(thread.getName());

        Thread thread1 = new Thread(new RunnableTask());
        thread1.start();
        System.out.println(thread1.getName());

    }
}
