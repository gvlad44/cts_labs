package gont.vlad.g1093.dp.adapter;

public interface GoogleAuthFunctions {

	public abstract String fetchName();
	
	public abstract String fetchEmail();
	
	public abstract void createValidSession();
	
	public abstract void sendDataFromAPI(String name, String email);
	
}
