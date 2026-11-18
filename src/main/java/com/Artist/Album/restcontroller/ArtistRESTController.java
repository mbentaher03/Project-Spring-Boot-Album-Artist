package com.Artist.Album.restcontroller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.Artist.Album.entites.Artist;
import com.Artist.Album.repos.ArtistRepository;

@RestController
@RequestMapping("/api/art")
@CrossOrigin("*")
public class ArtistRESTController {

	@Autowired
	ArtistRepository artistRepository;

	@RequestMapping(method = RequestMethod.GET)
	public List<Artist> getAllArtists() {
		return artistRepository.findAll();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Artist getArtistById(@PathVariable("id") Long id) {
		return artistRepository.findById(id).get();
	}

	@RequestMapping(method = RequestMethod.POST)
	public Artist addArtist(@RequestBody Artist artist) {
		artist.setIdArtist(null);
		return artistRepository.save(artist);
	}
}
