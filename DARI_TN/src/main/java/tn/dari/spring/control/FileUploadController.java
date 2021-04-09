package tn.dari.spring.control;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import tn.dari.spring.service.FileUploadService;

@RestController
public class FileUploadController {
	
	@Autowired
	FileUploadService fileUploadService;
	
	//http://localhost:8082/DARITN/servlet/uploadfile
	
	@PostMapping("/uploadfile")
	public void uploadFile(@RequestParam("file") MultipartFile file) throws IllegalStateException, IOException{
		
		fileUploadService.uploadFile(file);
		
	}

}
