package kz.kbtu.sf.base;

import kz.kbtu.sf.base.model.Greeting;
import kz.kbtu.sf.base.model.IGreetingable;

public class MyTestService implements IGreetingable {
    public Greeting makeGreeting(String name) {
        return new Greeting(123, "214");
    }
}
