package tn.dari.spring.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.flickr4java.flickr.FlickrException;

import tn.dari.spring.entity.Ads;
import tn.dari.spring.service.SaveAdsPhotoServiceImpl;

@RestController
public class PhotoApiImpl implements PhotoApi {
	@Autowired
	private SaveAdsPhotoServiceImpl saveAdsPhotoServiceImpl;

	@Override
	public Ads savePhoto(Long id, MultipartFile media, String titre) throws FlickrException, IOException {
		return saveAdsPhotoServiceImpl.savePhoto(id, media.getInputStream(), titre);
	}

}
