package org.bolo.photo.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.bolo.photo.model.TipoUtente;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ParametriServiceImpl implements ParametriService {

	@PersistenceContext
	private EntityManager em;
	
	public List<TipoUtente> listTipiUtente() throws Exception {
		return em.createQuery("from TipoUtente tu").getResultList();
	}

}
