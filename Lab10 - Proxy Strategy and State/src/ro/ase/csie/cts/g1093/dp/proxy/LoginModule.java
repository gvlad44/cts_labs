package ro.ase.csie.cts.g1093.dp.proxy;

public class LoginModule implements LoginInterface {

	String serverIP;
	String dbConnection;

	public LoginModule(String serverIP, String dbConnection) {
		super();
		this.serverIP = serverIP;
		this.dbConnection = dbConnection;
	}

	@Override
	public boolean login(String username, String pass) {
		System.out.println("Connecting to the db " + this.dbConnection);
		if (username.toLowerCase().equals("admin") && pass.equals("admin1234")) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean checkServerStatus() {
		return true;
	}

}
