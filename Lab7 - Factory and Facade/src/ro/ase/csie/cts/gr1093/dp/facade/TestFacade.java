package ro.ase.csie.cts.gr1093.dp.facade;

public class TestFacade {

	public static void main(String[] args) {

		// 1. Create a game server instance and connect
		GameServer server = new GameServer();
		server.connect();

		// 2. Create a login
		Login login = new Login("user", "1234");
		login.login();

		// 3. Create and get profile
		UserProfile userProfile = login.getUserProfile();
		String profile = userProfile.getProfile();

		// using the facade
		String profile2 = UserAPIFacade.getUserProfile("user2", "123456");
		System.out.println(profile2);
	}

}
