package ro.ase.csie.cts.g1093.prototype.models;

public interface ServerInterface {

	public String getIpAddress();
    public int getPort();
    public int getMaxConnections();

    public boolean connect();
    public boolean disconnect();

}
