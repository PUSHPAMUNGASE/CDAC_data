package example.spring.mvc.config;



import org.springframework.web.WebApplicationInitializer;

import org.springframework.web.context.WebApplicationContext;

import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

import org.springframework.web.servlet.DispatcherServlet;



import jakarta.servlet.ServletContext;

import jakarta.servlet.ServletException;

import jakarta.servlet.ServletRegistration;



public class SpringWebApplicationIntializer implements WebApplicationInitializer {

	//This class is used to configure DispatcherServlet in such a way that it accepts all the incoming request*/



	private WebApplicationContext getWebApplicationContext()

	{

		AnnotationConfigWebApplicationContext webctx = new AnnotationConfigWebApplicationContext();

		webctx.setConfigLocation("example");

          return webctx;   

	}

	

	@Override

	public void onStartup(ServletContext servletContext) throws ServletException {

		// TODO Auto-generated method stub

		
System.out.println("Application is being stated....");
		WebApplicationContext webAppCtx= getWebApplicationContext();

		//Building an object of dispatcherServlet based upon webappCtx

		

		

		DispatcherServlet frontController = new DispatcherServlet(webAppCtx);

		

		ServletRegistration.Dynamic registration= servletContext.addServlet("myFrontController", frontController);

		//Configuring frontControllerServlet that accepts all requests

		registration.addMapping("/");

		

		

		

	}



}