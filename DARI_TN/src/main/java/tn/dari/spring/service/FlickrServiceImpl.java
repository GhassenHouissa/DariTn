package tn.dari.spring.service;

import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;

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

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
@Service
@Slf4j
public class FlickrServiceImpl implements FlickrService {
	@Value("${flickr.apiKey}")
	  private String apiKey;

	  @Value("${flickr.apiSecret}")
	  private String apiSecret;

	  @Value("${flickr.appKey}")
	  private String appKey;

	  @Value("${flickr.appSecret}")
	  private String appSecret;
//@Autowired
	  private Flickr flickr;



	@SneakyThrows
	public String saveMedia(InputStream media, String title) throws FlickrException {
		connect();
		
		UploadMetaData uploadMetaData =new UploadMetaData();
		//uploadMetaData.setTitle(title);
		
		String photoId= flickr.getUploader().upload(media, uploadMetaData);
		return flickr.getPhotosInterface().getPhoto(photoId).getMedium640Url();
	}
	
	 private void connect() throws InterruptedException, ExecutionException, IOException, FlickrException {
		    flickr = new Flickr(apiKey, apiSecret, new REST());
		    Auth auth = new Auth();
		    auth.setPermission(Permission.DELETE);
		    auth.setToken(appKey);
		    auth.setTokenSecret(appSecret);
		    RequestContext requestContext = RequestContext.getRequestContext();
		    requestContext.setAuth(auth);
		    flickr.setAuth(auth);
		  }





}
