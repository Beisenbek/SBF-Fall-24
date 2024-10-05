package kz.kbtu.sf.base.service;

import kz.kbtu.sf.base.model.CustomSpringEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ComposerService implements ApplicationListener<CustomSpringEvent> {
    @Override
    public void onApplicationEvent(CustomSpringEvent event) {
       log.info("Received spring custom event - " + event.getPayload());
    }
}
