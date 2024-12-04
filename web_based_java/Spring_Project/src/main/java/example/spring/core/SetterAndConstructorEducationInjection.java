package example.spring.core;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterAndConstructorEducationInjection {

	

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("spring-config5.xml");
		Object profileObj=context.getBean("myProfile");
		System.out.println(profileObj);
		

	}

	}


