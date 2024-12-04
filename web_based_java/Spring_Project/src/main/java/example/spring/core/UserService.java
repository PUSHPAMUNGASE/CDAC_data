package example.spring.core;

public class UserService implements GreetingService {
     private String userName;
     private String userAge;
     
	public UserService() {
		super();
		System.out.println("Inside UserService()");
	}

	
	
	
	public UserService(String userName, String userAge) {
	System.out.println("inside the parameterized constructor");
		this.userName = userName;
		this.userAge = userAge;
	}




	public String getUserName() {
		System.out.println("Getting user name");
		return userName;
	}

	public void setUserName(String userName) {
		System.out.println("Setting user name");
		this.userName = userName;
	}

	public String getUserAge() {
		return userAge;
	}

	public void setUserAge(String userAge) {
	
		this.userAge = userAge;
	}

	@Override
	public String sayGreeting() {
		String message="Hey "+userName
				+", Your age is "+userAge+" years";
		return message;
	}

	
	
}
