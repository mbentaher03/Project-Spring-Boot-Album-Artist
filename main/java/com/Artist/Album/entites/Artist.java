package com.Artist.Album.entites;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity 
public class Artist {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long idArtist;
	private String nomArtiste;
	private String paysOrigine;
	private Date dateNaissance;
	
	
	@OneToMany (mappedBy = "artist")
	@JsonIgnore
	private List<Album> albums;
	
	public Artist() {
		super();
	}
	public Long getIdArtist() {
		return idArtist;
	}
	public void setIdArtist(Long idArtist) {
		this.idArtist = idArtist;
	}
	public String getNomArtiste() {
		return nomArtiste;
	}
	public void setNomArtiste(String nomArtiste) {
		this.nomArtiste = nomArtiste;
	}
	public String getPaysOrigine() {
		return paysOrigine;
	}
	public void setPaysOrigine(String paysOrigine) {
		this.paysOrigine = paysOrigine;
	}
	public Date getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	
	

}
