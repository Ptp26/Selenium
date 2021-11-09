
public class MethodOverloading {
	
	public static void main(String[] args) {
		
		
		MethodOverloading mo = new MethodOverloading();
		
		mo.login(215654, "password");
		mo.login(1235, "password", "1232");
		mo.login("username", "password");
		
		
	}
	
	public void login(String s , String p) {
		
		System.out.println("Login is succuessfull using username and  password !!");
	}
	public void login(int s , String p) {
		System.out.println("Login is successfull using phoneno and password");
	}
	
	public void login(int s , String p , String t) {
		System.out.println("Login is successfull using phoneno ,  password , OTP");
	}

}
