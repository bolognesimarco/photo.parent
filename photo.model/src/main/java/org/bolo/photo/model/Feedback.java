package org.bolo.photo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Feedback {
	
	@Id
	private int id;

	@Column
	private int score;
	
	@Column
	private String messaggio;
	
	@ManyToOne
    @JoinColumn(name="rilasciatoDa", nullable=false)
	private Utente rilasciatoDa;
	
	@ManyToOne
    @JoinColumn(name="ricevutoDa", nullable=false)
	private Utente ricevutoDa;
}
