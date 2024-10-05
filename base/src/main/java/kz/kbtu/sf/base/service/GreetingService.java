package kz.kbtu.sf.base.service;

import kz.kbtu.sf.base.model.CustomSpringEvent;
import kz.kbtu.sf.base.model.Greeting;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;

import java.util.concurrent.atomic.AtomicLong;

@Slf4j
public class GreetingService {

    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    private final String color;
    public  GreetingService(String color) {
        this.color = color;
    }

    public Greeting makeGreeting(String name) {
        log.info(color);

        Greeting greeting = new Greeting(counter.incrementAndGet(), String.format(template, name));

        CustomSpringEvent customSpringEvent = new CustomSpringEvent(this, greeting.content());
        applicationEventPublisher.publishEvent(customSpringEvent);

        return greeting;

    }
}
