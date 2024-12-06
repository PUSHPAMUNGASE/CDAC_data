package example.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import example.spring.mvc.model.User;
import example.spring.mvc.model.UserValidator;


@Controller // Marks this class as a Controller of Spring of Spring MVC Application
@SessionAttributes({"loggedInUser"})
public class SpringMvcController {
	//@RequestMapping("/doGreet") // Providing mapping between the URL and Method
	@GetMapping("/doGreet")
	public String getIndexPage() {
		System.out.println("Inside getIndexPage()");
		return "index"; // Returning a view name

	}

	//@RequestMapping("/doLogin")
	@GetMapping("/doLogin")
	public String getLoginPage() {
		System.out.println("Inside the loginPage()");
		return "login";
	}

	//@RequestMapping(value="/doValidate", method = RequestMethod.POST)
	@PostMapping("/doValidate")
	public String getResultPage(@RequestParam("uid") String userName,
			                      @RequestParam("pwd") String password) 
	{
		/*
		 * this method return one of the 2 possible result pages: success and failure
		 * depending upon users's validity
		 */
		String resultPage = "failure";
		// Building a Model object: User based upon userName and password
		User userDataModel = new User(userName,password);
		//Passing the Model object to UserValidation for validation
		boolean valid=UserValidator.isValid(userDataModel);
		if(valid) {
			resultPage="success";
		}
		return resultPage;
	}
	
	//@RequestMapping(value="/doValidateAgain", method = RequestMethod.POST)
	@PostMapping("/doValidateAgain")
	public String getResultPageAgain(
			                      @RequestParam("uid") String userName,
                                  @RequestParam("pwd") String password,
                                  Model modelObject ) 
	{
		String resultPage = "failurePage";
		User userDataModel = new User(userName,password);
		//Passing the Model object to UserValidation for validation
		boolean valid=UserValidator.isValid(userDataModel);
		if(valid) {
			resultPage="successPage";
			//Adding a userName in the Model object
			modelObject.addAttribute("loggedInUser", userName);
		}
		return resultPage;
	}
}
