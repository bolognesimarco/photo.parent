package org.bolo.photo.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Membership {
	
	@Id
	private int id;
	
	@Column
	private Date dataInizio;
	
	@Column
	private Date dataFine;
	
	@ManyToOne(optional=false)
	@JoinColumn(name="tipoMembership", nullable=false, updatable=false)
	private TipoMembership tipoMembership;
	
	@ManyToOne(optional=false)
	@JoinColumn(name="utente", nullable=false, updatable=false)
	private Utente utente;
}
