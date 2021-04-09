package tn.dari.spring.service;

import java.io.InputStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flickr4java.flickr.Flickr;
import com.flickr4java.flickr.FlickrException;
import com.flickr4java.flickr.uploader.UploadMetaData;

import lombok.extern.slf4j.Slf4j;
@Service
@Slf4j
public class FlickrServiceImpl implements FlickrService {


	private Flickr flickr;

	
	public String saveMedia(InputStream media, String title) throws FlickrException {
		UploadMetaData uploadMetaData =new UploadMetaData();
		uploadMetaData.setTitle(title);
		
		String photoId= flickr.getUploader().upload(media, uploadMetaData);
		return flickr.getPhotosInterface().getPhoto(photoId).getMedium640Url();
	}
	
	





}
