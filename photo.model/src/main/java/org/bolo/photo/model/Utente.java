package org.bolo.photo.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Utente {
	
	@Id
	@GeneratedValue
	private int id;

	@Column
	private String name;
	
	@Column
	private Date dataIscrizione;
	
	@Column
	private Date dataMember;
	
	@Column
	private String password;
	
	@OneToMany
	@JoinColumn(name="UtenteId")
	private List<Utente> collaboratori;
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy="utente")
	private List<Membership> memberships;
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy="rilasciatoDa")
	private List<Feedback> feedbackRilasciati;
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy="ricevutoDa")
	private List<Feedback> feedbackRicevuti;
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy="soggetto")
	private List<Foto> soggettoDi;
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy="fotografo")
	private List<Foto> fotografoDi;
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy="pubblicatore")
	private List<Foto> pubblicate;
	
	@ManyToMany(mappedBy="visualizzatori")
	private List<Foto> visualizzate;
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy="rilasciatoDa")
	private List<Voto> voti;
	
}
