package example.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringSimpleExample {

	public static void main(String[] args) {
//Retriving the bean from spring-congif.xml against its ID:myBean
		
		ApplicationContext context;
		String filePath="./src/main/resources/spring-config.xml";
		context =new FileSystemXmlApplicationContext(filePath);
		Object loadedObject=context.getBean("myBean");
		GreetingService gs=(GreetingService)loadedObject;
		
		String reply=gs.sayGreeting();
		System.out.println(reply);
		System.out.println("---------------------------------");
		GreetingService gs2= new WelcomeService();
		System.out.println(gs2.sayGreeting());
		

		
		
		/*
		 *In this example both the objects reffered by 'gs' and 'gs2' are the components but 'gs'
		 *is obtained through Spring's envirnoment
		 *where'gs2' is not
		 *Therefore 'gs' become a Managed Component and 'gs2' is an Unmanaged component 
		 */
		 
	}

}
