package gont.vlad.g1093.dp.proxy;

public class User {

	private String name;
	private String email;
	private boolean isAdmin;
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public boolean isAdmin() {
		return isAdmin;
	}
	public User(String name, String email, boolean isAdmin) {
		super();
		this.name = name;
		this.email = email;
		this.isAdmin = isAdmin;
	}
	
}
