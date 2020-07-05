package com.metrobus.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.metrobus.model.*;
import com.metrobus.service.MetrobusService;

//import com.mongodb.model.Person;
//import com.mongodb.service.PersonService;

@RestController
public class MetrobusController {

	@Autowired
	private MetrobusService metrobusService;
	
	@RequestMapping("/getAll")
	public List<Metrobus> getlAll(){
		return metrobusService.getAll2();
	}
	/*
	@Autowired
	private PersonService personService;
	
	@RequestMapping("/create")
	public String create(@RequestParam String firstName, @RequestParam String lastName,
			@RequestParam int age) {
		Person p = personService.create(firstName, lastName, age);
		return p.toString();
	}
	
	@RequestMapping("/get")
	public Person getPErson(@RequestParam String firstName) {
		return personService.getByFirstName(firstName);
		
	}
	
	@RequestMapping("/getAll")
	public List<Person> getlAll(){
		return personService.getAll();
	}
	
	@RequestMapping("/update")
	public String update(@RequestParam String firstName, @RequestParam String lastName, @RequestParam int age) {
		Person p = personService.update(firstName, lastName, age);
		return p.toString();
	}
	
	@RequestMapping("/delete")
	public String delete(@RequestParam String firstName) {
		personService.delete(firstName);
		return "Deleted " + firstName;
	}
	
	@RequestMapping("/deleteAll")
	public String deleteAll() {
		personService.deleteAll();
		return "Deleted all records";
	}
	*/
}
