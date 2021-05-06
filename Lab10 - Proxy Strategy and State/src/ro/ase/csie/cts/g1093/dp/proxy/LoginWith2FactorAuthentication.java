package ro.ase.csie.cts.g1093.dp.proxy;

public class LoginWith2FactorAuthentication implements LoginInterface {

	LoginInterface loginModule = null;

	public LoginWith2FactorAuthentication(LoginInterface loginModule) {
		super();
		this.loginModule = loginModule;
	}

	public void setLoginModule(LoginInterface loginModule) {
		this.loginModule = loginModule;
	}

	public boolean checkGeneratedCode(int code) {
		if (code == 1245) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean login(String username, String pass) {
		if (this.loginModule.login(username, pass)) {
			System.out.println("Input the generated code you have received");
			if (checkGeneratedCode(1234)) {
				System.out.println("Hello" + username);
				return true;
			} else {
				System.out.println("Incorect code");
			}
		}
		return false;
	}

	@Override
	public boolean checkServerStatus() {
		return this.loginModule.checkServerStatus();
	}

}
