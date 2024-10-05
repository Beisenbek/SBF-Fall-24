package kz.kbtu.sf.base;

import kz.kbtu.sf.base.controller.GreetingController;
import kz.kbtu.sf.base.model.Greeting;
import kz.kbtu.sf.base.model.IGreetingable;
import kz.kbtu.sf.base.service.GreetingService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BaseApplicationTests {

	@Test
	void test1() {
		IGreetingable service = new GreetingService();
		GreetingController controller1 = new GreetingController(service);
		Greeting greeting = controller1.greeting("test");
		assert(greeting.content().equals("Hello, test"));
		assert(greeting.id() == 1);
	}

}
