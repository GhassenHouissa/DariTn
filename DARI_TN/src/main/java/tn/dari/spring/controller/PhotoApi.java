package tn.dari.spring.controller;

import java.io.IOException;

import org.springframework.web.multipart.MultipartFile;

import com.flickr4java.flickr.FlickrException;

import tn.dari.spring.entity.Ads;
import tn.dari.spring.utility.BadWordsException;

public interface PhotoApi {

	Ads savePhoto(Long id,  MultipartFile media) throws FlickrException, IOException, BadWordsException ;


}
