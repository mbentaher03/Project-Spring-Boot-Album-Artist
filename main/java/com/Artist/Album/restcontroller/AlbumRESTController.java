package com.Artist.Album.restcontroller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.Artist.Album.entites.Album;
import com.Artist.Album.service.AlbumService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class AlbumRESTController {

	private final AlbumService albumService;

	public AlbumRESTController(AlbumService albumService) {
		this.albumService = albumService;
	}

	@GetMapping
	public List<Album> getAllAlbums() {
		return albumService.getAllAlbums();
	}

	@GetMapping("/{id}")
	public Album getAlbumById(@PathVariable("id") Long id) {
		return albumService.getAlbum(id);
	}
	//@RequestMapping(method = RequestMethod.POST) 
	@PostMapping() 
	public Album createAlbum(@RequestBody Album album) { 
	return albumService.saveAlbum(album); 
	} 
	
	//@RequestMapping(method = RequestMethod.PUT) 
	@PutMapping() 
	public Album updateProduit(@RequestBody Album album) { 
	return albumService.updateAlbum(album); 
	} 
	
	//@RequestMapping(value="/{id}",method = RequestMethod.DELETE) 
	@DeleteMapping("/{id}") 
	public void deleteAlbum(@PathVariable("id") Long id) 
	{ 
	albumService.deleteAlbumById(id); 
	} 
	//@RequestMapping(value="/prodscat/{idCat}",method = RequestMethod.GET) 
	@GetMapping("/albArt/{idArtist}") 
	public List<Album> getAlbumsByArtId(@PathVariable("idArtist") Long idArtist) { 
	return albumService.findByArtistIdArtist(idArtist); 
	} 
}
