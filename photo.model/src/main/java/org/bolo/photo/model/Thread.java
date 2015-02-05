package org.bolo.photo.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Thread {
	
	@Id
	@GeneratedValue
	private int id;
	
	@Column
	private boolean cancellatoMittentePrimo;
	
	@Column
	private boolean cancellatoDestinatarioPrimo;
	
	@ManyToOne(optional=false)
	@JoinColumn(name="annuncio", nullable=false, updatable=false)
	private Annuncio annuncio;
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy="thread")
	private List<Messaggio> messaggi;
	
	@ManyToOne(optional=false)
	@JoinColumn(name="mittentePrimo", nullable=false, updatable=false)
	private Utente mittentePrimo;
	
	@ManyToOne(optional=false)
	@JoinColumn(name="destinatarioPrimo", nullable=false, updatable=false)
	private Utente destinatarioPrimo;
}
