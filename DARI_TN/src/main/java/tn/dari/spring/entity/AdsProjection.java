package tn.dari.spring.entity;

import org.springframework.data.rest.core.config.Projection;

@Projection(name="P1",types=Ads.class)
public interface AdsProjection {
public String getTitle4();
public String getDescription4();

}
