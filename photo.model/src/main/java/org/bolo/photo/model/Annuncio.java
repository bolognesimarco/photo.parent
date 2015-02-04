package org.bolo.photo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Annuncio {

	@Id
	@GeneratedValue
	private int id;
	
	@ManyToOne
    @JoinColumn(name="proponente", nullable=false)
	private Utente proponente;
	
}
