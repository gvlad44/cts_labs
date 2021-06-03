package ro.ase.csie.cts.g1093.prototype.models;

import ro.ase.csie.cts.g1093.singleton.models.ServerInterface;


public class ServerBackend implements ServerInterface, Cloneable {

	String IPAddress;
	int portNumber;
	int maxConnections;
	boolean isConnected;

	public ServerBackend(String iPAddress, int portNumber, int maxConnections, boolean isConnected) {
		this.IPAddress = iPAddress;
		this.portNumber = portNumber;
		this.maxConnections = maxConnections;
		this.isConnected = isConnected;
	}
	
	private ServerBackend() {
		
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

	@Override
	public Object clone() throws CloneNotSupportedException {
		
		ServerBackend serverCopy = new ServerBackend();
		serverCopy.IPAddress = this.IPAddress;
		serverCopy.portNumber = this.portNumber;
		serverCopy.maxConnections = this.maxConnections;
		serverCopy.isConnected = this.isConnected;
		
		return serverCopy;
	}
	
	

}