package org.bolo.photo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TipoMembership {
	
	@Id
	private int id;
	
	@Column
	private String descrizione;
}
