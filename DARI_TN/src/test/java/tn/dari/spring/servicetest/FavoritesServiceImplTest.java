package tn.dari.spring.servicetest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import tn.dari.spring.entity.Favorites;
import tn.dari.spring.service.IFavoritesService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FavoritesServiceImplTest {
	
	private static final Logger l = LogManager.getLogger(FavoritesServiceImplTest.class);
	
	@Autowired
	IFavoritesService fs ;
	
	@Test
	public void addFavoritesTest(){
		Favorites f = new Favorites();
		
		fs.addFavorites(f);
	}
	
	@Test
	public void deleteFavoritesTest(){
		l.info("favorites deleted : "+ fs.deleteFavorites(2));
		
	}

}
