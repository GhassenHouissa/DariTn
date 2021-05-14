package tn.dari.spring.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.flickr4java.flickr.FlickrException;

import tn.dari.spring.entity.Ads;
import tn.dari.spring.service.SaveAdsPhotoServiceImpl;
import tn.dari.spring.utility.BadWordsException;

@RestController
public class PhotoApiImpl implements PhotoApi {
	@Autowired
	private SaveAdsPhotoServiceImpl saveAdsPhotoServiceImpl;
	@PostMapping(path="/photos/{id}")
	@Override
	public Ads savePhoto(@PathVariable Long id,@RequestPart("file") MultipartFile media) throws FlickrException, IOException, BadWordsException {
		return saveAdsPhotoServiceImpl.savePhoto(id, media.getInputStream(), "test");
	}

	


	
}
