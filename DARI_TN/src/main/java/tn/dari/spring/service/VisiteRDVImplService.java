package tn.dari.spring.service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sun.xml.bind.v2.runtime.unmarshaller.UnmarshallingContext.State;

import tn.dari.spring.entity.Bank;
import tn.dari.spring.entity.VisiteRDV;
import tn.dari.spring.repository.VisiteRDVRepository;




@Service
public class VisiteRDVImplService implements VisiteRDVService {
	@Autowired
	VisiteRDVRepository visiteRDVRepository;
	@Autowired
	private static final Logger l= LogManager.getLogger(VisiteRDVImplService.class);

	@Override
	public List<VisiteRDV> retrieveAllVisiteRDV() {
		List<VisiteRDV> app=(List<VisiteRDV>) visiteRDVRepository.findAll();
		for(VisiteRDV visiteRdv:app) {
			l.info("visiteRdvs +++++++++"+ visiteRdv);}
		
		return app;
	}

	@Override
	public VisiteRDV addVisiteRDV(VisiteRDV a,Date date) {
		List<VisiteRDV> app=(List<VisiteRDV>) visiteRDVRepository.findAll();

		visiteRDVRepository.save(a);

		return a;
	}

	@Override
	public void deleteVisiteRDV(String id) {
		
		visiteRDVRepository.deleteById(Long.parseLong(id));		

		
	}

	@Override
	public VisiteRDV retrieveVisiteRDV(String id) {
		return null;
	}

	@Override
	public void ConfrmerVisiteRDV(Date date) {
		List<VisiteRDV> app=(List<VisiteRDV>) visiteRDVRepository.findAll();

		for(VisiteRDV a:app) {
		
		if (a.getDateVisiteRDV().compareTo(date) > 0) {
			
			a.setState("confirmed");
			l.info("visiteRdv is1111111111" + a.getState());
		}
		else if (a.getDateVisiteRDV().compareTo(date) < 0) {
			a.setState("confirmed");
			l.info("visiteRdv is22222222" + a.getState());

			
		}
		else {
			l.info("visiteRdv is333333333" + a.getState());

		}
		visiteRDVRepository.save(a);
		
		}
		
	}

	@Override
	public int countVisiteRDV() {
		int max=0;
		List<VisiteRDV> app=(List<VisiteRDV>) visiteRDVRepository.findAll();
		for(VisiteRDV visiteRdv:app) {
			max++;
			
		}
		l.info(" you have "+ max + "visiteRdvs");


		return max;

	}

	
	@Override
	public List<VisiteRDV> rechercheVisiteRDV() {
		List<VisiteRDV> app=(List<VisiteRDV>)visiteRDVRepository.retrieveAllVisiteRDVByState("bizerte");
		for(VisiteRDV visiteRdv:app) {

		l.info("visiteRdv is+++++++++++" + visiteRdv);}
		return app;

		
	}

	@Override
	public void VisiteRDVToday() {
		List<VisiteRDV> app=(List<VisiteRDV>) visiteRDVRepository.findAll();
		int max=0;
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date date = new Date();
		l.info("********" + dateFormat.format(date));

		
	
		for(VisiteRDV a:app) {
			
		if ((a.getDateVisiteRDV().getDay()== date.getDay() ) && (a.getDateVisiteRDV().getMonth()== date.getMonth()) && (a.getDateVisiteRDV().getYear()== date.getYear())) {
			max++;
			
			l.info("********" + dateFormat.format(date)+a);
		}}
		l.info("you have "+max+" visiteRdvs today++++++++++++" );

		
	}
	@Override
	public void BlockUserByAttendance() {
		
		List<VisiteRDV> app=(List<VisiteRDV>) visiteRDVRepository.findAll();

		for(VisiteRDV a:app) {
			
					if(a.getAttendance().equals("absent") ) {
						
						visiteRDVRepository.save(a);



						
	}
					}
	
	
	}
	
	public VisiteRDV updateVisiteRDV(VisiteRDV visiteRDV) {
		return VisiteRDVRepository.saveAndFlush(visiteRDV);
	}
	
	
	@Override
	public VisiteRDV addVisiteRDV(VisiteRDV visitRDV) {
		
		return visiteRDVRepository.save(visitRDV);
	}

	@Override
	public VisiteRDV retrieveVisiteRDV() {
		return (VisiteRDV) visiteRDVRepository.findAll();
	}

	@Override
	public VisiteRDV addVisiteRDV(VisiteRDV a, Date date, String state, VisiteRDV visitRDV) {
		// TODO Auto-generated method stub
		return null;
	}
	
	


	

}