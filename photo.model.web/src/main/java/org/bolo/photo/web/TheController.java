package org.bolo.photo.web;

import org.bolo.photo.service.PrimoServizio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class TheController {
	
	@Autowired
	private PrimoServizio servizio;
	
	
}
