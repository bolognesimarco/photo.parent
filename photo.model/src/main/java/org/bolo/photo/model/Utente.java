package org.bolo.photo.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
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
	
	@Column
	private Date dataRegistrazione;
	
	@Column
	private String paginaWeb;
	
	@Column
	private String selfDescription;
	
	@ManyToMany
    @JoinTable(name="Utente_Osservati")
	private List<Utente> utentiOsservati;
	
	@ManyToMany(mappedBy="utentiOsservati")
	private List<Utente> osservatori;
	
	@ManyToMany
    @JoinTable(name="Utente_Desiderati")
	private List<Utente> utentiDesiderati;
	
	@ManyToMany(mappedBy="utentiDesiderati")
	private List<Utente> desideratori;
	
	@ManyToMany
    @JoinTable(name="Utente_Lavorati")
	private List<Utente> utentiLavorati;

	
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
