package org.bolo.photo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Utente {
	
	@Id
	@GeneratedValue
	private int id;
	
	@ManyToOne(optional=false)
	@JoinColumn(name="tipoUtente", nullable=false, updatable=true)
	private TipoUtente tipoUtente;
	
	@Column
	private String nome;
	
	
	@ManyToOne(optional=false)
	@JoinColumn(name="luogo", nullable=false, updatable=true)
	private Luogo luogo;
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public TipoUtente getTipoUtente() {
		return tipoUtente;
	}

	public void setTipoUtente(TipoUtente tipoUtente) {
		this.tipoUtente = tipoUtente;
	}
	
	
	
	
	
}
