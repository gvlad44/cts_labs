package gont.vlad.g1093.dp.proxy;

public class RouteUser implements RoutingInterface {

	@Override
	public boolean accessPage(User user) {
		if (user.isAdmin()) {
			System.out.println("Great success");
			return true;
		} else {
			System.out.println("Not a great ideea my guy");
			return false;
		}
	}

}
