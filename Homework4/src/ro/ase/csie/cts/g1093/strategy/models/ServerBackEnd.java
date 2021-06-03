package ro.ase.csie.cts.g1093.strategy.models;

public class ServerBackEnd implements ServerInterface{

	String IPAddress;
	int portNumber;
	int maxConnections;
	boolean isConnected;
	
	ServerConnectionsInterface currentSetup = null;
	
	public void changeSetupStrategy(ServerConnectionsInterface setup) {
		this.currentSetup = setup;
	}
	
	public void changeSetup(int port, int maxConnections) {
		if(this.currentSetup != null) {
			this.currentSetup.adjustServer(maxConnections, port, this);
		}
	}

	public ServerBackEnd(String iPAddress, int portNumber, int maxConnections, boolean isConnected) {
		this.IPAddress = iPAddress;
		this.portNumber = portNumber;
		this.maxConnections = maxConnections;
		this.isConnected = isConnected;
	}

	
	public void setIPAddress(String iPAddress) {
		this.IPAddress = iPAddress;
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

	public boolean isConnected() {
		return isConnected;
	}

}
