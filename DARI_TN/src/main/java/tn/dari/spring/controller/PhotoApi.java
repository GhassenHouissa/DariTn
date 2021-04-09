package tn.dari.spring.controller;

import java.io.IOException;
import java.io.InputStream;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import com.flickr4java.flickr.FlickrException;

import tn.dari.spring.entity.Ads;

public interface PhotoApi {

	Ads savePhoto(Long id, @RequestPart("file") MultipartFile media, String titre) throws FlickrException, IOException ;
}
