package tn.dari.spring.service;

import java.io.File;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import tn.dari.spring.repository.AdsRepository;

@Service
public class FileObService {
@Autowired
private AdsRepository adsRepository;


public void uploadFile(MultipartFile file) throws IllegalStateException, IOException {
file.transferTo(new File("C:\\Users\\Lenevo\\mediaAds\\products\\"+file.getOriginalFilename()));
}
}
