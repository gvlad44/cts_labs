package gont.vlad.g1093.dp.proxy;

import java.util.HashMap;
import java.util.Map;

public class RoutingProxy implements RoutingInterface {

	public static final int MAX_TRIES = 1;
	RoutingInterface router = null;
	Map<String, Integer> counter = new HashMap<>();

	public RoutingProxy(RoutingInterface initialRouter) {
		this.router = initialRouter;
	}

	@Override
	public boolean accessPage(User user) {
		Integer no = counter.get(user.getName());
		if (no == null) {
			counter.put(user.getName(), 0);
			no = 0;
		}

		if (no >= MAX_TRIES) {
			System.out.println("You tried to access a secured page multiple times. You have been logged out.");
			return false;
		}

		if (router != null) {
			boolean res = this.router.accessPage(user);
			if (res == false) {
				no++;
				counter.put(user.getName(), no);
			} else {
				no = 0;
				counter.put(user.getName(), no);
			}
			return res;
		} else {
			throw new UnsupportedOperationException("Something went wrong");
		}

	}

}
