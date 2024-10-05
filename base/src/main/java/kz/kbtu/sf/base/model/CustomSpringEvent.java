package kz.kbtu.sf.base.model;

import org.springframework.context.ApplicationEvent;

public class CustomSpringEvent  extends ApplicationEvent {
    private String payload;

    public CustomSpringEvent(Object source, String payload) {
        super(source);
        this.payload = payload;
    }
    public String getPayload() {
        return payload;
    }
}
