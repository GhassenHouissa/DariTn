package tn.dari.spring.service;

import java.io.InputStream;

import com.flickr4java.flickr.FlickrException;

public interface SaveAdsPhotoService<T> {
T savePhoto(Long id, InputStream media, String titre) throws FlickrException;
}
