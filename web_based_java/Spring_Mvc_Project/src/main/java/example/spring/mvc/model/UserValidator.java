package example.spring.mvc.model;

public class UserValidator {
	public static boolean isValid(User userObject) {
		boolean result = false;
		String currentUserId = userObject.getUserName();
		String currentPassword = userObject.getPassword();
		
		if(
				currentUserId.equals("admin")
				&&
				currentPassword.equals("phonix123")
				)
			result = true;
		return result;
		
	}

}
