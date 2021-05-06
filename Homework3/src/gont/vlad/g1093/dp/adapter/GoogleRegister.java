package gont.vlad.g1093.dp.adapter;

public class GoogleRegister implements GoogleAuthFunctions{

	String userName;
	String userEmail;
	
	public GoogleRegister(String userName, String userEmail) {
		super();
		this.userName = userName;
		this.userEmail = userEmail;
	}

	@Override
	public String fetchName() {
		return this.userName;
	}

	@Override
	public String fetchEmail() {
		return this.userEmail;
	}

	@Override
	public void createValidSession() {
		System.out.println(String.format("Created a valid session for %s with the email %s",
				this.userName, this.userEmail));
	}

	@Override
	public void sendDataFromAPI(String name, String email) {
		System.out.println(String.format("Sent the following data to the back end: %s with the email %s",
				this.userName, this.userEmail));
		
	}

}
