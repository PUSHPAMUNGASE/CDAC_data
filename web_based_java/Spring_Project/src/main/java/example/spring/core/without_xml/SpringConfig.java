package example.spring.core.without_xml;

import java.util.Arrays;
import java.util.Collection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

@Configuration  //marks this class as a Configuration unit
@ComponentScan(basePackages = {"another","third","example"})//Used to perform package scan
//@ComponentScan("another")
public class SpringConfig {
	
	
	//1
	@Bean //Marks this method as a Bean Configuration specific method
	public GreetingImpl getGreetingImpl() {
		GreetingImpl gi=new GreetingImpl();
		return gi;
	}
	
	
	//2
	//Configuring a bean of type MessageImple with some different 
	//ID:myMessage
	@Bean("myMessage") //changing default ID to myMessage
	public MessageImpl getMessageImpl() {
		MessageImpl mi = new MessageImpl();
		return mi;
	}
	
	
	//3
	//Configuring a bean of type:java.util.Collection
	@Bean("allCourses")
	public Collection<String>getCourseList(){
	  Collection<String> courseList= Arrays.asList("Core Java","Spring","Angular","AWS");
	  return  courseList;
	}
	
	
	
	//4
	@Bean("myTest")
	@Lazy  //Marks this bean as lazy so that it get loaded lazily
	//this is equivalent of lazy-init="true"
	@Scope("prototype") //Marks this bean with scope as 'prototype' 
	//This is equivalent of scope='prototype'
	public TestImpl getTestImpl() {
		TestImpl ti=new TestImpl();
		return ti;
	}

}










