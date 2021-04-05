package tn.dari.spring.entity.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.dari.spring.entity.Visit;
import tn.dari.spring.service.VisitService;

@RestController
@RequestMapping("/api/visit")
public class VisitController {

	@Autowired 
    private VisitService visitService;


	@GetMapping("/all")
	public ResponseEntity<List<Visit>> getAllVisits {
    	return new ResponseEntity<List<Visit>>(visitService.findAllVisits(), HttpStatus.OK);
	}
    
    @PostMapping("/add")
	public ResponseEntity<Visit> addVisit(@Validated @RequestBody Visit visit) {
    	Visit visit1 = visitService.addVisit(visit);
		if (visit1 == null) return new ResponseEntity<Visit>(visit, HttpStatus.CONFLICT);
		return new ResponseEntity<Visit>(visit1, HttpStatus.OK);
	}
    
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Visit> deleteVisit(@PathVariable("id") long id)
    {
    	visitService.deleteVisit(id);
        return new ResponseEntity<Visit>( HttpStatus.OK);
    }
    
    @PutMapping("/update")
    public ResponseEntity<Visit> updateFormation(@Validated @RequestBody Visit visit)
    {
    	Visit visit1 = visitService.updateVisit(visit);
		if (visit1 == null) return new ResponseEntity<Visit>(visit, HttpStatus.CONFLICT);
		return new ResponseEntity<Visit>(visit1, HttpStatus.OK);
    }
    
    
    @GetMapping("/{id}")
    public ResponseEntity<Visit> getVisit(@PathVariable("id") Long id) {
    	Visit visit1 = visitService.findVisitByID(id);
    	if (visit1 == null) return new ResponseEntity<Visit>(visit1, HttpStatus.CONFLICT);
		return new ResponseEntity<Visit>(visit1, HttpStatus.OK);
    }
}
