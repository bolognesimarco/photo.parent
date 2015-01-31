package org.bolo.photo.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Guest")
public class Guest extends Utente {

}
