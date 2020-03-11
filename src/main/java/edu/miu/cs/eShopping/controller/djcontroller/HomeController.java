package edu.miu.cs.eShopping.controller.djcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	@GetMapping(value= {"/","/eShopping","/eShopping/home"})
	public String dispayHome() {
		return "home/index";
	}
}
