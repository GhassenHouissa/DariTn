package tn.dari.spring.service;

import java.io.InputStream;

import org.springframework.stereotype.Repository;

import com.flickr4java.flickr.FlickrException;
@Repository
public interface FlickrService {
String saveMedia(InputStream media, String title) throws FlickrException;
}
 