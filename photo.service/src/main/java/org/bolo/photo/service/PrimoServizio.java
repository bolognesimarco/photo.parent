package org.bolo.photo.service;

import org.bolo.photo.model.Utente;

public interface PrimoServizio {
	
	public void servizio() throws Exception;
	public Utente findByUserName(String username) throws Exception;
	public String sayHelloTo(String name) throws Exception;

}
