package org.bolo.photo.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Annuncio {

	@Id
	@GeneratedValue
	private int id;
	
	@ManyToOne
    @JoinColumn(name="proponente", nullable=false)
	private Utente proponente;
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy="annuncio")
	private List<Thread> risposte;
	
}
