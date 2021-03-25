package ro.ase.cts.g1093.dp.singleton.staticversion;

public class RESTBackend {
	String url;
	String data;
	
	public static final RESTBackend theBackend;
	
	//executed only once
	static {
		System.out.println("Executed when loaded by the JVM");
		theBackend = new RESTBackend();
		theBackend.url = "www.acs.ase.ro/cts";
	}
	
	//another block
	{
		System.out.println("Executed before any constructor call");
	}
	
	private RESTBackend() {
		
	}
	
//	private RESTBackend() {
//		//get the data from config files
//		
//	}
	
}
