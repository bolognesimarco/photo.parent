package org.bolo.photo.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Messaggio {
	
	@Id
	@GeneratedValue
	private int id;
	
	@Column 
	private String messaggio;
	
	@Column
	private Date data;
	
	@ManyToOne(optional=false)
	@JoinColumn(name="messaggio", nullable=false, updatable=false)
	private Thread thread;

}
