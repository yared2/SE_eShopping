package edu.miu.cs.eShopping.controller.djcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import edu.miu.cs.eShopping.model.djmodel.Person;
import edu.miu.cs.eShopping.service.djservice.PersonService;

@Controller
public class PersonController {
	
	@Autowired
	private PersonService personService;

	public PersonController(PersonService personService) {
		this.personService = personService;
	}
	
	@GetMapping(value="/person/list")
	public ModelAndView listPersons() {
		ModelAndView modelAndView = new ModelAndView();
		List<Person> persons = personService.getAllPersons();
		modelAndView.addObject("persons",persons);
		modelAndView.setViewName("/person/list");
		return modelAndView;
	}
}
