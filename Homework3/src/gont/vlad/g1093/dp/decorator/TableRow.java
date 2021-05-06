package gont.vlad.g1093.dp.decorator;

public abstract class TableRow {
	
	protected int matchId;
	protected String place;
	protected String date;
	
	public TableRow(int matchId, String place, String date) {
		super();
		this.matchId = matchId;
		this.place = place;
		this.date = date;
	}
	
	public int getMatchId() {
		return matchId;
	}
	public String getPlace() {
		return place;
	}
	public String getDate() {
		return date;
	}
	
	public abstract void withdrawFromMatch();
	
	public abstract void displayInfo();
	
	public abstract void checkInUsers();
	
	public abstract void deleteMatch();
	
}
