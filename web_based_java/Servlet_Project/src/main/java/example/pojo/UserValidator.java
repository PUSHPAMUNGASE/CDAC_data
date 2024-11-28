package example.pojo;

public class UserValidator {
	
	public static boolean isValid(User user) {
		boolean res = false;
		String uName = user.getUserName();
		String pass = user.getPassword();
		
		if(uName.equals("admin") && pass.equals("Don@123")) {
			return true;
		}
		return res;
	}
}
