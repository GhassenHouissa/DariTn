package tn.dari.spring;

import javax.servlet.ServletContext;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.filter.DelegatingFilterProxy;

//import tn.dari.spring.config.SecSecuityConfig;
import tn.dari.spring.utility.BadWordsAds;

public class AppInitializer implements WebApplicationInitializer {
	 @Override
	    public void onStartup(ServletContext sc) {

	     /*   AnnotationConfigWebApplicationContext root = new AnnotationConfigWebApplicationContext();
	        root.register(SecSecuityConfig.class);

	        sc.addListener(new ContextLoaderListener(root));

	        sc.addFilter("securityFilter", new DelegatingFilterProxy("springSecurityFilterChain"))
	          .addMappingForUrlPatterns(null, false, "/*");*/
	   	 BadWordsAds.loadConfigs();

	    }
}
