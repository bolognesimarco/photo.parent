package org.bolo.photo.web;

import org.bolo.photo.service.PrimoServizio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TheController {
	
	@Autowired
	private PrimoServizio servizio;
	
	@RequestMapping(value = "/test")
	public @ResponseBody String test() {
		System.out.println("TEST !!!");
		return "DONE";
	}
	
	@RequestMapping(value="/primo")
	public String primo(){
		return "primo";
	}
	
	@RequestMapping(value="/index")
	public String index(){
		return "index";
	}
}
