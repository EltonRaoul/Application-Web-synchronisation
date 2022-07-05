package com.server.api.Models;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "\"Utilisateurs\"")
public class Utilisateurs {
	
	@javax.persistence.Id
	@Column(name = "\"idUtilisateur\"", updatable = false, nullable = false)
	private UUID idUtilisateur;
	
	
	public Utilisateurs() {
		super();
		
		UUID id = UUID.randomUUID();
		this.setIdUtilisateur(id);
	}


	public UUID getIdUtilisateur() {
		return idUtilisateur;
	}


	public void setIdUtilisateur(UUID idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}
	
	
	

}
