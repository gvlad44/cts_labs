package ro.ase.csie.cts.g1093.dp.proxy;

public class TestProxy {

	public static void main(String[] args) {
		LoginInterface loginModule = new LoginModule("10.0.0.1", "users");
		
		if(loginModule.login("admin", "admin1234")) {
			System.out.println("Hi admin");
		} else {
			System.out.println("Wrong");
		}
		
		String[] passwords = new String[] {
				"1234", "123456", "admin", "root",
				"admin1234"
		};
		
		loginModule = new LoginWith2FactorAuthentication(loginModule);
		
		for(String pass : passwords) {
			if(loginModule.login("admin", pass)) {
				System.out.println("Found it");
				break;
			}
		}
		
	}

}
