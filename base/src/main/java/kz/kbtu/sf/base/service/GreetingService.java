package kz.kbtu.sf.base.service;

import kz.kbtu.sf.base.model.Greeting;

import java.util.concurrent.atomic.AtomicLong;

public class GreetingService {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    public Greeting makeGreeting(String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
}
