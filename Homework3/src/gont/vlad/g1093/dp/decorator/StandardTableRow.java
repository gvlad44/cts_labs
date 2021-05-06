package gont.vlad.g1093.dp.decorator;

public class StandardTableRow extends TableRow{

	String currentUser;
	
	public StandardTableRow(int matchId, String place, String date, String currentUser) {
		super(matchId, place, date);
		this.currentUser = currentUser;
	}

	@Override
	public void withdrawFromMatch() {
		System.out.println(String.format("Withdrawing %s from the match %d, that takes place at %s",
				this.currentUser, this.matchId, this.place));
	}

	public String getCurrentUser() {
		return currentUser;
	}

	@Override
	public void displayInfo() {
		System.out.println("Not available");
	}

	@Override
	public void checkInUsers() {
		System.out.println("Not available");
	}

	@Override
	public void deleteMatch() {
		System.out.println("Not available");
	}

}
