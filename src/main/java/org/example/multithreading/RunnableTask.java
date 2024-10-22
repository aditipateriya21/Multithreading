package org.example.multithreading;

public class RunnableTask implements Runnable{

    @Override
    public void run() {
        System.out.println("Thread initialised using runnable");
    }
}
