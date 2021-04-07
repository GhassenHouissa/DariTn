package tn.dari.spring.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import tn.dari.spring.entity.Remotesurveillance;
import tn.dari.spring.service.RemotesurveillanceService;
@RestController
public class RemotesurveillanceControl {
	@Autowired
	RemotesurveillanceService rs;
	
	@PostMapping("/add-Remotesurveillance")
	@ResponseBody
	public Remotesurveillance addRemotesurveillance(@RequestBody Remotesurveillance remotesurveillance) {
		Remotesurveillance r = rs.addRemotesurveillance(remotesurveillance);
	return r;
	}
	
	@GetMapping("/Show-All")
	@ResponseBody 
	public List<Remotesurveillance> RetrieveAllById(){
		return rs.retrieveRemotesurveillances();
	}
	
	
	@DeleteMapping("/remove-Remotesurveillance/{Remotesurveillance_ID}")
	@ResponseBody
	public void removeRemotesurveillance(@PathVariable("Remotesurveillance_ID") Long id) {
	rs.deleteRemotesurveillance(id);
	}
	
	@PutMapping("/update-Remotesurveillance/{Remotesurveillance_ID}")
	@ResponseBody
	   public Remotesurveillance updateRemotesurveillance(@RequestBody Remotesurveillance remotesurveillance) {
		return rs.updateRemotesurveillance(remotesurveillance);
		}


}
