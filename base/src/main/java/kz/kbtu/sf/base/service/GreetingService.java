package kz.kbtu.sf.base.service;


import kz.kbtu.sf.base.model.CustomSpringEvent;
import kz.kbtu.sf.base.model.Greeting;
import kz.kbtu.sf.base.model.IGreetingable;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicLong;

@Service
@Slf4j
public class GreetingService implements IGreetingable {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @Autowired
    ApplicationEventPublisher applicationEventPublisher;

    public  GreetingService() {
    }

    public Greeting makeGreeting(String name) {
        Greeting greeting = new Greeting(counter.incrementAndGet(), String.format(template, name));

        CustomSpringEvent customSpringEvent = new CustomSpringEvent(this, greeting.content());
        applicationEventPublisher.publishEvent(customSpringEvent);

        return greeting;

    }
}
