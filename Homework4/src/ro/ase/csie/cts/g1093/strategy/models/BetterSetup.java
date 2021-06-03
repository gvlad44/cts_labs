package ro.ase.csie.cts.g1093.strategy.models;

public class BetterSetup implements ServerConnectionsInterface{

	@Override
	public void adjustServer(int connections, int port, ServerBackEnd server) {
		server.maxConnections += connections;
		server.portNumber = port;
	}

}
