package com.Artist.Album;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.Artist.Album.entites.Album;
import com.Artist.Album.entites.Artist;
import com.Artist.Album.repos.AlbumRepository;

@SpringBootTest
class AlbumApplicationTests {
	@Autowired 
	private AlbumRepository albumRepository; 
	@Test 
	public void testCreateAlbum() { 
	Album alb = new Album("Cowboy Carter","country-rooted",new Date(), 60L); 
	albumRepository.save(alb); 
	} 
	@Test 
	public void testFindAlbum() 
	{ 
	Album a = albumRepository.findById(1L).get();     
	System.out.println(a); 
	} 
	@Test 
	public void testUpdateAlbum() 
	{ 
	Album a = albumRepository.findById(1L).get(); 
	a.setGenreMusical("dance-pop"); 
	albumRepository.save(a); 
	} 
	@Test 
	 public void testDeleteAlbum() 
	  { 
	   albumRepository.deleteById(4L);; 
	    
	  } 
	@Test 
	 public void testListerTousAlbum() 
	  { 
	   List<Album>  albs = albumRepository.findAll();   
	   for (Album a : albs) 
	   { 
	    System.out.println(a); 
	   }   
	  } 
	@Test
	public void testFindAlbumByTitre() 
	{ 
	List<Album> albs = albumRepository.findByTitreAlbum("BRAT");     
	   for (Album a : albs) 
	   { 
	    System.out.println(a); 
	   } 
	} 
	@Test
	public void testFindAlbumByTitreContains() 
	{ 
	List<Album> albs = albumRepository.findByTitreAlbumContains("B");     
	   for (Album a : albs) 
	   { 
	    System.out.println(a); 
	   } 
	} 
	
	@Test
	public void testfindBytitreGenreAlbum ()
	{ 
	List<Album>  albs = albumRepository.findBytitreGenreAlbum("Cowboy Carter", "country-rooted"); 
	for (Album a : albs) 
	{ 
	System.out.println(a); 
	} 
	}
	
	@Test 
	public void testfindByArtist() 
	{ 
	Artist art = new Artist(); 
	art.setIdArtist(1L);    
	List<Album>  albs = albumRepository.findByArtist(art); 
	for (Album a : albs) 
	{ 
	System.out.println(a); 
	} 
	} 
	
	@Test 
	public void findByArtistIdArtist() 
	{    
	List<Album>  albs = albumRepository.findByArtistIdArtist(1L); 
	for (Album a : albs) 
	{ 
	System.out.println(a); 
	} 
	} 
	
	@Test 
	 public void findByOrderByTitreAlbumAsc() 
	  { 
	  List<Album>  albs =    
	   albumRepository.findByOrderByTitreAlbumAsc();   
	   for (Album a : albs) 
	   { 
	    System.out.println(a); 
	   } 
	  } 
	
	@Test 
	 public void trierAlbumsTitresGenre() 
	  { 
	  List<Album>  albs = albumRepository.trierAlbumsTitresGenre();
	   
	   for (Album a : albs) 
	   { 
	    System.out.println(a); 
	   } 
	  } 
}
