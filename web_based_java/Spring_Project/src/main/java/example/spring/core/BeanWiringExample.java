package example.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanWiringExample {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("spring-config2.xml");
		Object customerObj=context.getBean("myCustomer");
		System.out.println(customerObj);
		

	}

}
