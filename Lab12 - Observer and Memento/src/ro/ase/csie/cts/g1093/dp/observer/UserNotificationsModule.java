package ro.ase.csie.cts.g1093.dp.observer;

public class UserNotificationsModule implements ConnectionStatusInterface{

	@Override
	public void connectionUp() {
		System.out.println("Pop-up message: Connection active");
	}

	@Override
	public void connectionDown() {
		System.out.println("Pop-up message: Connection was lost");
	}

}
