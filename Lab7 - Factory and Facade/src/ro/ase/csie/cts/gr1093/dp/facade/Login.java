package ro.ase.csie.cts.gr1093.dp.facade;

public class Login {
	String username;
	String password;

	public Login(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	public void login() {

	}

	public UserProfile getUserProfile() {
		return new UserProfile();
	}
	
}
