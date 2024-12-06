package example.spring.rest;



import java.time.LocalDate;

import java.util.Arrays;

import java.util.Collection;



import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;



@RestController //Combines @Controller and @ResponseBody

public class SpringRestController {

	

	@GetMapping("/doGreet")

	public String getGreetingData()

	{

		

		return "Hi All,Welcome to the world spring rest";

	}

	

	

	@GetMapping("/showGreeting")

	public Greeting getOneGreeting()

	{

		Greeting greetingObject= new Greeting("Happy New Year", LocalDate.of(2025, 1, 1));

		

		return greetingObject;

	}


	
	

	@GetMapping("/showAllGreeting")

	public Collection<Greeting> getAllGreeting()

	{

		Greeting greetingObject= new Greeting("Happy New Year", LocalDate.of(2025, 1, 1));

		Greeting greetingObject1= new Greeting("Bye Bye 2024", LocalDate.of(2024, 12, 31));

		Greeting greetingObject2= new Greeting("Merry Christmas", LocalDate.of(2024, 12, 25));

		

		

		Collection<Greeting>allGreetings=Arrays.asList(greetingObject,greetingObject1,greetingObject2);

		return allGreetings;

	}



	


}

