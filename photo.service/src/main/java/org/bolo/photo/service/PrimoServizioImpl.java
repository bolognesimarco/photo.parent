package org.bolo.photo.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.bolo.photo.model.TipoUtente;
import org.bolo.photo.model.Utente;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class PrimoServizioImpl implements PrimoServizio {

	@PersistenceContext
	private EntityManager em;
	
	public void servizio() throws Exception {
		TipoUtente tu = new TipoUtente();
		tu.setDescrizione("Fotografo");
		em.persist(tu);

	}
	
	public Utente findByUserName(String username) throws Exception{
		List<Utente> utenti = em.createQuery("from Utente u where u.name=:name").setParameter("name", username).getResultList();
		if(utenti!=null && utenti.size()>0){
			return utenti.get(0);
		}
		return null;
	}
	
	public String sayHelloTo(String name) throws Exception{
		return "Hello "+name;
	}

}
