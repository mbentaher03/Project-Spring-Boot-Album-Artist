package com.Artist.Album.service;

import java.util.List;


import org.springframework.stereotype.Service;

import com.Artist.Album.entites.Album;
import com.Artist.Album.entites.Artist;
import com.Artist.Album.repos.AlbumRepository;

@Service 
public class AlbumServiceImpl implements AlbumService {
    
	//@Autowired
	private final AlbumRepository albumRepository ;
	
	
	
	public AlbumServiceImpl(AlbumRepository albumRepository) {
		super();
		this.albumRepository = albumRepository;
	}

	@Override
	public Album saveAlbum(Album a) {
		return albumRepository.save(a);
	}
	@Override
	public Album updateAlbum(Album a) {
		return albumRepository.save(a);
	}

	@Override
	public void deleteAlbum(Album a){
		albumRepository.delete(a);
		
	}

	@Override
	public void deleteAlbumById(Long id) {
		albumRepository.deleteById(id);
		
	}

	@Override
	public Album getAlbum(Long id) {
		return albumRepository.findById(id).get();
	}

	@Override
	public List<Album> getAllAlbums() {
		return albumRepository.findAll();
	}

	@Override
	public List<Album> findByTitreAlbum(String TitreAlbum) {
		
		return  albumRepository.findByTitreAlbum(TitreAlbum);
	}

	@Override
	public List<Album> findByTitreAlbumContains(String titreAlbum) {
		return albumRepository.findByTitreAlbumContains(titreAlbum);
	}

	@Override
	public List<Album> findBytitreGenreAlbum(String titreAlbum, String genreMusical) {
		return albumRepository.findBytitreGenreAlbum(titreAlbum, genreMusical) ;
	}

	@Override
	public List<Album> findByArtist(Artist artist) {
		return albumRepository.findByArtist(artist);
	}

	@Override
	public List<Album> findByArtistIdArtist(Long id) {
		return albumRepository.findByArtistIdArtist(id);
	}

	@Override
	public List<Album> findByOrderByTitreAlbumAsc() {
		
		return albumRepository.findByOrderByTitreAlbumAsc();
	}

	@Override
	public List<Album> trierAlbumsTitresGenre() {
		return albumRepository.trierAlbumsTitresGenre();
	}

}
