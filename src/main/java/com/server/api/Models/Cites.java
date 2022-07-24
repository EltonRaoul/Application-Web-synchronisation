package com.server.api.Models;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "Cites")
public class Cites {
	
	Date date = new Date(System.currentTimeMillis());
	
	
		
		@javax.persistence.Id
		@Column(name = "idCite", updatable = false, nullable = false)
	 	private UUID idCite;
	    
		@NotEmpty
	    @Column(name = "nomCite")
	    private String nomCite;
	    
		@NotEmpty
	    @Column(name = "refCite")
	    private String refCite;
	    
		@NotEmpty
	    @Column(name = "area")
	    private Number area;
		
	    @Column(name = "image")
	    private String image = "";
	    
	    @Column(name = "statutCite")
	    private Boolean statut = true;
	    
	    
	    @Column(name = "createdAt")
	    private Date createdAt = date;
	    
	    
	    @Column(name = "updatedAt")
	    private Date updatedAt = date;
	    
	    @Column(name = "update_Client")
	    private boolean updateClient = false;
	    
	    
	    @Column(name = "update_Server")
	    private boolean updateServer = true;
	    
	    @Column(name = "last_Update")
	    private String lastUpdate = "";
	   
	    @Column(name = "idUtilisateur")
	    private UUID idUtilisateur;
	   
	    
	    public Cites() {
			super();
			
			UUID id = UUID.randomUUID();
			this.setIdCite(id);
		}
	    
	    


		public Cites(UUID idCite, String nomCite, String refCite, String image, Boolean statut, Date createdAt,
				Date updatedAt, boolean updateClient, boolean updateServer, String lastUpdate, UUID idUtilisateur) {
			super();
			this.idCite = idCite;
			this.nomCite = nomCite;
			this.refCite = refCite;
			this.image = image;
			this.statut = statut;
			this.createdAt = createdAt;
			this.updatedAt = updatedAt;
			this.updateClient = updateClient;
			this.updateServer = updateServer;
			this.lastUpdate = lastUpdate;
			this.idUtilisateur = idUtilisateur;
		}




		public UUID getIdCite() {
			return idCite;
		}


		public void setIdCite(UUID idCite) {
			this.idCite = idCite;
		}


		public String getNomCite() {
			return nomCite;
		}


		public void setNomCite(String nomCite) {
			this.nomCite = nomCite;
		}


		public String getRefCite() {
			return refCite;
		}


		public void setRefCite(String refCite) {
			this.refCite = refCite;
		}


		public String getImage() {
			return image;
		}


		public void setImage(String image) {
			this.image = image;
		}


		public Boolean getStatut() {
			return statut;
		}


		public void setStatut(Boolean statut) {
			this.statut = statut;
		}


		public Date getCreatedAt() {
			return createdAt;
		}


		public void setCreatedAt(Date createdAt) {
			this.createdAt = createdAt;
		}


		public Date getUpdatedAt() {
			return updatedAt;
		}


		public void setUpdatedAt(Date updatedAt) {
			this.updatedAt = updatedAt;
		}


		public boolean isUpdateClient() {
			return updateClient;
		}


		public void setUpdateClient(boolean updateClient) {
			this.updateClient = updateClient;
		}


		public boolean isUpdateServer() {
			return updateServer;
		}


		public void setUpdateServer(boolean updateServer) {
			this.updateServer = updateServer;
		}


		public String getLastUpdate() {
			return lastUpdate;
		}


		public void setLastUpdate(String lastUpdate) {
			this.lastUpdate = lastUpdate;
		}


		public UUID getIdUtilisateur() {
			return idUtilisateur;
		}


		public void setIdUtilisateur(UUID idUtilisateur) {
			this.idUtilisateur = idUtilisateur;
		}
	    
	    

}
