package kz.kbtu.sf.base.controller;

import kz.kbtu.sf.base.model.Greeting;
import kz.kbtu.sf.base.model.IGreetingable;
import kz.kbtu.sf.base.service.GreetingService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@Slf4j
public class GreetingController {

    private final IGreetingable service;

    @GetMapping("/greeting")
    public Greeting greeting(
            @RequestParam(value = "name", defaultValue = "World") String name
    ) {
        Greeting result = service.makeGreeting(name);
        log.info(result.content());
        return result;
    }

    @GetMapping("/test")
    public String test() {
        return  "ok";
    }
}
