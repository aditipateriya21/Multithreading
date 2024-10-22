package org.example.producerconsumer;

import java.util.LinkedList;

public class SharedBuffer {
    private final LinkedList<Integer> buffer = new LinkedList<>();
    private final int LIMIT = 5;

    public synchronized void produce(int value) throws InterruptedException {
        while (buffer.size() == LIMIT) {
            wait();
        }
        buffer.add(value);
        System.out.println("Produced: " + value);
        notifyAll();
    }

    public synchronized int consume() throws InterruptedException {
        while (buffer.isEmpty()) {
            wait();
        }
        int value = buffer.removeFirst();
        System.out.println("Consumed: " + value);
        notifyAll();
        return value;
    }
}