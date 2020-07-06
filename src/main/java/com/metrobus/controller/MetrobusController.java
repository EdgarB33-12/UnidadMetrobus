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
	
}
