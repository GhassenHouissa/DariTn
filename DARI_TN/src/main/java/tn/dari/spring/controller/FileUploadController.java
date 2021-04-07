package tn.dari.spring.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import tn.dari.spring.service.FileObService;

@RestController
public class FileUploadController {
@Autowired
FileObService fileObService;
@PostMapping(value="li")
public void uploadFile(@RequestParam("file") MultipartFile file) throws IllegalStateException, IOException {
	fileObService.uploadFile(file);	
}
}
