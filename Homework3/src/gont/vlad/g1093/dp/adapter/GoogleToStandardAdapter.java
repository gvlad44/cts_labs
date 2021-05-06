package gont.vlad.g1093.dp.adapter;

public class GoogleToStandardAdapter extends StandardRegister{
	
	GoogleAuthFunctions googleRegister = null;

	public GoogleToStandardAdapter(GoogleAuthFunctions auth) {
		super(auth.fetchName(), auth.fetchEmail(), 0, null, null);
		this.googleRegister = auth;
	}

	@Override
	public void validate() {
		googleRegister.createValidSession();
	}

	@Override
	public void useRESTBackEnd(String name, String email, int age, String phone, String facebook) {
		googleRegister.sendDataFromAPI(name, email);
	}

}
