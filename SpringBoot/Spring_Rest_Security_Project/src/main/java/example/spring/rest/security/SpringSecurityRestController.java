package example.spring.rest.security;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringSecurityRestController {
	@GetMapping("/doGreet")  //This resource is accessible only to admin users
public String getGreetings() {
	return"Welcome to Spring Security";
}
	@GetMapping("/doAdminWork") //This resource is accessible only to ADMIN users
	public String doAdminWork() {
		return "Doing admin work";
		
	}
	
	@GetMapping("/doRegularWork")//This resourse is accessible to ADMIN as well as REGULAR users.
	public String doRegularWork() {
		return "Doing Regular work";
		
	}
	
}
