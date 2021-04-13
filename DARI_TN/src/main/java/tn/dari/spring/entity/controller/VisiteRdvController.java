package tn.dari.spring.entity.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.dari.spring.entity.VisiteRDV;
import tn.dari.spring.service.VisiteRDVService;

@RestController
public class VisiteRdvController {
	@Autowired
	VisiteRDVService visiteRDVService;
	

	@GetMapping("/all_visiteRDV")
	 @ResponseBody
	 public List<VisiteRDV> getVisiteRDVs() {
	 List<VisiteRDV> list = visiteRDVService.retrieveAllVisiteRDV();
	 return list;
	} 
	
		  @PostMapping("/add-visiteRDV")
		  @ResponseBody
		  public VisiteRDV addVisiteRDV(@RequestBody VisiteRDV a,Date date) {
			  VisiteRDV app = visiteRDVService.addVisiteRDV(a,date);
		 return app;
		  }
		  
		  @DeleteMapping("/remove-user/{IdVisiteRDV}")
		   @ResponseBody
		   public void removeVisiteRDV(@PathVariable("IdVisiteRDV") String id) {
			  visiteRDVService.deleteVisiteRDV(id);
		   }
		  @GetMapping("/countvisiteRDV")
		   @ResponseBody
		   public int CountVisiteRDV() {
		   return visiteRDVService.countVisiteRDV();
		   }
		  
		  @GetMapping("/recherche")
		   @ResponseBody
			 public List<VisiteRDV> rechercheConfirmedVisiteRDVs() {
			  List<VisiteRDV> list =visiteRDVService.rechercheVisiteRDV();
		return list;
		   }
		  
		  @GetMapping("/BlockUser")
		  @ResponseBody
		  public void BlockUser() {
			  visiteRDVService.BlockUserByAttendance();
		 
		  }

		  
		  
	

}
