package org.bolo.photo.web;

import java.util.List;

import org.bolo.photo.model.TipoUtente;
import org.bolo.photo.service.ParametriService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TheController {
	
	@Autowired
	private ParametriService parametriService;
	
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
	
	@RequestMapping(value = "/getTipiUtente")
	public @ResponseBody List<TipoUtente> getTipiUtente() throws Exception {
		return parametriService.listTipiUtente();
	}
}
