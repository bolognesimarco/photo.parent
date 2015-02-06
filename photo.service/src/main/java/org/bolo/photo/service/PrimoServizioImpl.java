package org.bolo.photo.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.bolo.photo.model.TipoUtente;
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

}
