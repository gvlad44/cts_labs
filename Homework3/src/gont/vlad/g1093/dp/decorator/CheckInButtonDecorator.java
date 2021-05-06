package gont.vlad.g1093.dp.decorator;

import java.util.ArrayList;

public class CheckInButtonDecorator extends RowDecorator{

	ArrayList<String> participatingUsers;
	
	public CheckInButtonDecorator(TableRow row, ArrayList<String> participatingUsers) {
		super(row);
		this.participatingUsers = participatingUsers;
	}
	
	@Override
	public void checkInUsers() {
		for (String user : participatingUsers) {
			System.out.println(String.format("Checking in user %s", user));
		}
		System.out.println(String.format("Check in done for match %s", this.row.getMatchId()));
	}

}
