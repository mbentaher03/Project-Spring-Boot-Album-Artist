package com.Artist.Album.service;

import java.util.List;

import com.Artist.Album.entites.Album;
import com.Artist.Album.entites.Artist;

public interface AlbumService {
	  Album saveAlbum(Album a); 
	  Album updateAlbum(Album a); 
	  void deleteAlbum(Album a); 
	    void deleteAlbumById(Long id); 
	  Album getAlbum(Long id); 
	  List<Album> getAllAlbums();
	  List<Album> findByTitreAlbum(String TitreAlbum); 
	  List<Album> findByTitreAlbumContains(String titreAlbum ); 
	  List<Album> findBytitreGenreAlbum (String titreAlbum,String genreMusical); 
	  List<Album> findByArtist (Artist artist); 
	  List<Album> findByArtistIdArtist(Long id); 
	  List<Album> findByOrderByTitreAlbumAsc(); 
	  List<Album> trierAlbumsTitresGenre(); 
}
