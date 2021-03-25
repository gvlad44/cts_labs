package ro.ase.cts.g1093.dp.singleton.registry;

public class TestSingletonRegistry {

	public static void main(String[] args) {
		RESTBackend backend = RESTBackend.getRESTBackend("10.0.0.1", "profile");
		RESTBackend backend2 = RESTBackend.getRESTBackend("10.0.0.1", "profile");

		if(backend == backend2) {
			System.out.println("Same object");
		}
		else {
			System.out.println("Small diffy");
		}

		RESTBackend backend3 = RESTBackend.getRESTBackend("127.0.0.1", "profile");
		if(backend == backend3) {
			System.out.println("Same object");
		}
		else {
			System.out.println("Small diffy");
		}

		
	}

}
