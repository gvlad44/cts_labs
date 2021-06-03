package ro.ase.csie.cts.g1093.strategy.models;

public class StandardSetup implements ServerConnectionsInterface {

	@Override
	public void adjustServer(int connections, int port, ServerBackEnd server) {
		server.portNumber = port;
		server.maxConnections = connections;
	}

}
