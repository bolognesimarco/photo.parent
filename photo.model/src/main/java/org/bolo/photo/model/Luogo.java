package org.bolo.photo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Luogo {
	
	@Id
	@GeneratedValue
	private int id;
	
	@Column
	private Double latitudine;
	
	@Column
	private Double longitudine;
	
}
