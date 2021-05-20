package ro.ase.csie.cts.g1093.dp.observer;

public class TestObserver {

	public static void main(String[] args) {
		
		ServerConnectionModule connectionModule = new ServerConnectionModule();
		
		ConnectionStatusInterface backup = new BackUpModule();
		ConnectionStatusInterface notification = new UserNotificationsModule();
		
		connectionModule.detectConnectionStatusChange(ConnectionStatus.UP);
		
		connectionModule.register(notification);
		connectionModule.register(backup);
		
		connectionModule.detectConnectionStatusChange(ConnectionStatus.DOWN);

		connectionModule.unregister(backup);
		connectionModule.detectConnectionStatusChange(ConnectionStatus.UP);

		
	}

}
