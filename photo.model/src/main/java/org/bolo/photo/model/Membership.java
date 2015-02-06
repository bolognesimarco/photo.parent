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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDataInizio() {
		return dataInizio;
	}

	public void setDataInizio(Date dataInizio) {
		this.dataInizio = dataInizio;
	}

	public Date getDataFine() {
		return dataFine;
	}

	public void setDataFine(Date dataFine) {
		this.dataFine = dataFine;
	}

	public TipoMembership getTipoMembership() {
		return tipoMembership;
	}

	public void setTipoMembership(TipoMembership tipoMembership) {
		this.tipoMembership = tipoMembership;
	}

	public Utente getUtente() {
		return utente;
	}

	public void setUtente(Utente utente) {
		this.utente = utente;
	}
}
