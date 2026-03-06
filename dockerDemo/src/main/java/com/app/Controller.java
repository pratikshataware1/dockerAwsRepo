package com.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
@GetMapping("get")
public void getmsg() {
	System.out.println("Hello From Docker Aws");
}

}
