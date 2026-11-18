package com.Artist.Album.entites;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
@Entity

public class Album {
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idAlbum ; 
	private String titreAlbum ; 
	private String genreMusical ; 
	private Date dateSortie ; 
	private Long dureeAlbum ;
	
	@ManyToOne
	private Artist artist ; 
	
	
	public Album() {
		super();
	}
	
	public Album(String titreAlbum, String genreMusical, Date dateSortie, Long dureeAlbum) {
		super();
		this.titreAlbum = titreAlbum;
		this.genreMusical = genreMusical;
		this.dateSortie = dateSortie;
		this.dureeAlbum = dureeAlbum;
	}

	public Long getIdAlbum() {
		return idAlbum;
	}
	public void setIdAlbum(Long idAlbum) {
		this.idAlbum = idAlbum;
	}
	public String getTitreAlbum() {
		return titreAlbum;
	}
	public void setTitreAlbum(String titreAlbum) {
		this.titreAlbum = titreAlbum;
	}
	public String getGenreMusical() {
		return genreMusical;
	}
	public void setGenreMusical(String genreMusical) {
		this.genreMusical = genreMusical;
	}
	public Date getDateSortie() {
		return dateSortie;
	}
	public void setDateSortie(Date dateSortie) {
		this.dateSortie = dateSortie;
	}
	public Long getDureeAlbum() {
		return dureeAlbum;
	}
	public void setDureeAlbum(Long dureeAlbum) {
		this.dureeAlbum = dureeAlbum;
	}

	@Override
	public String toString() {
		return "Album [idAlbum=" + idAlbum + ", titreAlbum=" + titreAlbum + ", genreMusical=" + genreMusical
				+ ", dateSortie=" + dateSortie + ", dureeAlbum=" + dureeAlbum + "]";
	}

	public Artist getArtist() {
		return artist;
	}

	public void setArtist(Artist artist) {
		this.artist = artist;
	} 
	

}
