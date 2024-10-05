package kz.kbtu.sf.base.conf;

import kz.kbtu.sf.base.service.GreetingService;
import org.springframework.beans.factory.annotation.Value;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
public class Config {
    @Value("${server.color}")
    String color;
    @Bean
    GreetingService getGreetingService() {
        log.info("i'm here!");
        return new GreetingService(color);
    }
}
