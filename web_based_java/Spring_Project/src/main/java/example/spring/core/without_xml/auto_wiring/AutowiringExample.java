package example.spring.core.without_xml.auto_wiring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AutowiringExample {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context 
		=new AnnotationConfigApplicationContext(APPSpringConfig.class);
		Object carObject=context.getBean("myCar");
		System.out.println(carObject);
		

	}

}
