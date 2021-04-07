package tn.dari.spring.service;




import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;


import tn.dari.spring.entity.Remotesurveillance;
import tn.dari.spring.repository.RemotesurveillanceRepository;

public class RemotesurveillanceServiceImpl implements RemotesurveillanceService {
	@Autowired
	RemotesurveillanceRepository rr;
	
	@Override
	public List<Remotesurveillance> retrieveRemotesurveillances() {
		List<Remotesurveillance> remotesurveillances =(List<Remotesurveillance>) rr.findAll();
	return remotesurveillances;
	}

		@Override
		public Remotesurveillance addRemotesurveillance(Remotesurveillance r) {
			
			return rr.save(r);
		}
		@Override
		public void deleteRemotesurveillance(Long id) {
			  rr.deleteById(id);
		}
		@Override
		public Remotesurveillance updateRemotesurveillance(Remotesurveillance remotesurveillance ) {
			
			return 	rr.save(remotesurveillance);
		}
	
}
