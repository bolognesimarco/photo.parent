package org.bolo.photo.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Foto {
	@Id
	private int id;
	
	@Column
	private String titolo;
	
	@Column
	private boolean vietataMinori;
	
	@ManyToOne
    @JoinColumn(name="soggetto", nullable=false)
	private Utente soggetto;
	
	@ManyToOne
    @JoinColumn(name="fotografo", nullable=false)
	private Utente fotografo;
	
	@ManyToOne
    @JoinColumn(name="pubblicatore", nullable=false)
	private Utente pubblicatore;
	
	
	@ManyToMany
	@JoinTable(name="Foto_Visualizzatori")
	private List<Utente> visualizzatori;
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy="foto")
	private List<Voto> voti;
	
	@ManyToMany
	@JoinTable(name="Foto_Tags")
	private List<Tag> tags;
	
	
}
