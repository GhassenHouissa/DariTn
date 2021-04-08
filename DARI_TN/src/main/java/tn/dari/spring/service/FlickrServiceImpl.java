package tn.dari.spring.service;

import java.io.InputStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.flickr4java.flickr.Flickr;
import com.flickr4java.flickr.FlickrException;
import com.flickr4java.flickr.REST;
import com.flickr4java.flickr.RequestContext;
import com.flickr4java.flickr.auth.Auth;
import com.flickr4java.flickr.auth.Permission;
import com.flickr4java.flickr.uploader.UploadMetaData;

import lombok.extern.slf4j.Slf4j;
import tn.dari.spring.entity.Ads;
import tn.dari.spring.repository.AdsRepository;

@Service
@Slf4j
public class FlickrServiceImpl implements FlickrService {
	
	@Autowired
	AdsRepository adsRepository;

	private Flickr flickr;

	@Autowired
	public FlickrServiceImpl(Flickr flickr) {
		super();
		this.flickr = flickr;
	}
	
	public String saveMedia(InputStream media, String title) throws FlickrException {
		UploadMetaData uploadMetaData =new UploadMetaData();
		uploadMetaData.setTitle(title);
		
		String photoId= flickr.getUploader().upload(media, uploadMetaData);
		return flickr.getPhotosInterface().getPhoto(photoId).getMedium640Url();
	}
	
	





}
