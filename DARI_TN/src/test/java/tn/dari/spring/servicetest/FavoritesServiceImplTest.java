package tn.dari.spring.servicetest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

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
	public void addFavoritesTest() throws ParseException{
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date date = dateFormat.parse("2021-04-8");
		Favorites f = new Favorites(date,12);
		
		fs.addFavorites(f);
	}
	
	@Test
	public void deleteFavoritesTest(){
		l.info("favorites deleted : "+ fs.deleteFavorites(3));
		
	}

}
