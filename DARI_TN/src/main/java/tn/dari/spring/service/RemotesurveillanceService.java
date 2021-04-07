package tn.dari.spring.service;

import java.util.List;
import tn.dari.spring.entity.Remotesurveillance;

public interface RemotesurveillanceService {
	public Remotesurveillance addRemotesurveillance(Remotesurveillance r);
	public List<Remotesurveillance> retrieveRemotesurveillances();
	public void deleteRemotesurveillance(Long id);
	public Remotesurveillance  updateRemotesurveillance(Remotesurveillance r) ;


}
