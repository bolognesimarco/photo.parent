package org.bolo.photo.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Tag {

	@Id
	@GeneratedValue
	private int id;
	
	@Column
	private String descrizione;
	
	@ManyToMany(mappedBy="tags")
	private List<Foto> foto;
}
