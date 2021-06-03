package ro.ase.csie.cts.g1093.singleton.models;

public class BackEndServer implements ServerInterface {

	String IPAddress;
	int portNumber;
	int maxConnections;
	boolean isConnected;

	private static BackEndServer serverInstance = null;

	private BackEndServer(String iPAddress, int portNumber, int maxConnections, boolean isConnected) {
		this.IPAddress = iPAddress;
		this.portNumber = portNumber;
		this.maxConnections = maxConnections;
		this.isConnected = isConnected;
	}

	private BackEndServer() {

	}

	@Override
	public String getIpAddress() {
		return this.IPAddress;
	}

	@Override
	public int getPort() {
		return this.portNumber;
	}

	@Override
	public int getMaxConnections() {
		return this.maxConnections;
	}

	@Override
	public boolean connect() {
		this.isConnected = true;
		return this.isConnected;
	}

	@Override
	public boolean disconnect() {
		this.isConnected = false;
		return this.isConnected;
	}

	public static BackEndServer getServerConnection() {
		if (serverInstance == null) {
			String IPAddress = "127.0.0.1";
			int portNumber = 8000;
			int maxConnections = 1;
			boolean isConnected = false;
			serverInstance = new BackEndServer(IPAddress, portNumber, maxConnections, isConnected);
		}
		return serverInstance;
	}

}
