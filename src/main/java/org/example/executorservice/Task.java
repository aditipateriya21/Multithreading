package org.example.executorservice;

public class Task implements  Runnable{

    @Override
    public void run() {
        System.out.println("Task is executed by: " + Thread.currentThread().getName());

    }
}
