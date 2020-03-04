package ru.atom.thread.practice;

import org.springframework.stereotype.Repository;

import javax.annotation.Resources;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @author apomosov
 * @since 15.03.17
 */
public class EventQueue {
    private static BlockingQueue<Event> instance = new LinkedBlockingQueue<>();

    public static BlockingQueue<Event> getInstance() {
        return instance;
    }
}
