package com.Artist.Album.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.Artist.Album.entites.Album;
import com.Artist.Album.entites.Artist;

@RepositoryRestResource(path = "rest") 
public interface AlbumRepository extends JpaRepository<Album, Long> {
    List<Album> findByTitreAlbum(String titreAlbum );
    List<Album> findByTitreAlbumContains(String titreAlbum );
    
    
   /* @Query("select a from Album a where a.titreAlbum like %?1 and a.genreMusical > ?2") 
    List<Album> findBytitreGenreAlbum (String titreAlbum,String genreMusical); 
    */
    
    @Query("select a from Album a where a.titreAlbum like %:titre and a.genreMusical > :genre") 
    List<Album> findBytitreGenreAlbum (@Param("titre") String titre,@Param("genre") String genre);
    
    
    @Query("select a from Album a where a.artist = ?1") 
    List<Album> findByArtist (Artist artist); 
    
    
    List<Album> findByArtistIdArtist(Long id); 
    
    List<Album> findByOrderByTitreAlbumAsc();
    
    @Query("select a from Album a order by a.titreAlbum ASC, a.genreMusical DESC") 
    List<Album> trierAlbumsTitresGenre ();
}
