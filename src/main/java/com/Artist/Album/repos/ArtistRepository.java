package com.Artist.Album.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import com.Artist.Album.entites.Artist;

@RepositoryRestResource(path = "art")
@CrossOrigin("http://localhost:4200/")
public interface ArtistRepository extends JpaRepository<Artist, Long> {

}
