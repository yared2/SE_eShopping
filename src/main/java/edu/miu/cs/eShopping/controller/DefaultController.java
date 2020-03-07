package edu.miu.cs.eShopping.controller;

import javax.servlet.http.HttpServletResponse;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")

public class DefaultController {

	
	@GetMapping
	public void loadIndex(HttpServletResponse httpResponse) throws Exception {
	   //String currentUsername = SecurityContextHolder.getContext().getAuthentication().getName();
		//httpResponse.sendRedirect("/user/"+currentUsername);
		httpResponse.sendRedirect("/swagger-ui.html");
	}
}
