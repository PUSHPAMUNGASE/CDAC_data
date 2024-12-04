package example.spring.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringAopExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(AopSpringConfig.class);

				Musician musicianObject=context.getBean(Musician.class);
		musicianObject.perform();
		System.out.println("------------------------------------");
		 Singer singerObject=context.getBean(Singer.class);
		 singerObject.perform();
		 System.out.println("======================================");
		 /*printing the names of the classes ofthe objects to which
		  *refrences musicianObject and singerObject are refering
		  */
		 System.out.println(musicianObject.getClass().getName());
		 System.out.println(singerObject.getClass().getName());
	}

}
