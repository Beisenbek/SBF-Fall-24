package kz.kbtu.sf.base.controller;

import kz.kbtu.sf.base.model.Greeting;
import kz.kbtu.sf.base.service.GreetingService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {

    GreetingService service = new GreetingService();

    @GetMapping("/greeting")
    public Greeting greeting(
            @RequestParam(value = "name", defaultValue = "World") String name
    ) {

        return  service.makeGreeting(name);

    }
}
