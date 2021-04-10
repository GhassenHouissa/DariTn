package tn.dari.spring.service;

import java.io.InputStream;

import com.flickr4java.flickr.FlickrException;

import tn.dari.spring.entity.Ads;

public interface SaveAdsPhotoService {
Ads savePhoto(Long id, InputStream media, String titre) throws FlickrException;
}
