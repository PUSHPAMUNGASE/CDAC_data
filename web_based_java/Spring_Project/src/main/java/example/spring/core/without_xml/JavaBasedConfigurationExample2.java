package example.spring.core.without_xml;

import java.util.Collection;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaBasedConfigurationExample2 {

	public static void main(String[] args) {
	 AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(SpringConfig.class);
	 Object loadedObject=context.getBean("myMessage");
		MessageImpl mi=(MessageImpl)loadedObject;
		mi.printMessage("Welcome", "James");
		System.out.println("============================");
		loadedObject=context.getBean("allCourses");
		Collection<String> allAvailableCouses=(Collection<String>)loadedObject;
		allAvailableCouses.stream().
		forEach(course -> System.out.println(course.toUpperCase()));  //lamda expression ->
		
		System.out.println("============================");
		Object Obj=context.getBean("myTest");
		Object Obj2=context.getBean("myTest");
		
		System.out.println("Same Object :" + (Obj==Obj2));
		

	}

}
