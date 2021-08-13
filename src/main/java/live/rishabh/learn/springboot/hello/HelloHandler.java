package live.rishabh.learn.springboot.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloHandler {
	
	@RequestMapping("/hello")
	public String sayHi() {
		return "Hi from server !!";
	}
}
