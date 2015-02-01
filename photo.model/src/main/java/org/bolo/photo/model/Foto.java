package org.bolo.photo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Foto {
	@Id
	private int id;
	
	@Column
	private String titolo;
	
	@Column
	private Boolean vietataMinori;
}
