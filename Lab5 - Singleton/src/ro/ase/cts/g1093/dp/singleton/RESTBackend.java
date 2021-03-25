package ro.ase.cts.g1093.dp.singleton;

public class RESTBackend {
	String url;
	String data;
	
	//eager instantiation
//	private static RESTBackend theBackend = new RESTBackend();
	
	private static RESTBackend theBackend = null;
	
	//lazy instantiation example
	private RESTBackend(String url, String data) {
		System.out.println("Openning a connection"
				+ " to the backend");
		this.url = url;
		this.data = data;
	}
	
	private RESTBackend() {
		
	}
	
	public void sendGET() {
		System.out.println("Send GET command to " + this.url);
	}
	
	public static synchronized RESTBackend getRESTBackend() {
		if(theBackend == null) {
			String url = "www.acs.ase.ro/game";
			String data = "get backend connection";
			theBackend = new RESTBackend(url, data);
		}
		
		return theBackend;
		
	}
	
}