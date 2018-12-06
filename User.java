package funcs;

public class User {
	
	String user_Name;
	String id;
	String password;
	
	public User(String user_Name,String id,String password) {
		this.user_Name = user_Name;
		this.id = id;
		this.password = password;
	}
	
	/*public void login1(String id , String password) {
		System.out.print(login(id , password));
	}*/
	
	public boolean login(String id , String password) {
		if(id.equals(this.id) && password.equals(this.password))
			return true;
		else return false;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
}
