package tn.dari.spring.service;

import java.io.InputStream;

import com.flickr4java.flickr.FlickrException;

public interface FlickrService {
String saveMedia(InputStream media, String title) throws FlickrException;
}
 