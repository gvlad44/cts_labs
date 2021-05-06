package gont.vlad.g1093.dp.decorator;

public abstract class RowDecorator extends TableRow{

	TableRow row = null;
	
	public RowDecorator(TableRow row) {
		super(row.getMatchId(), row.getPlace(), row.getDate());
		this.row = row;
	}

	@Override
	public void withdrawFromMatch() {
		System.out.println("Withdrawing from match");
	}

	@Override
	public void displayInfo() {
		this.row.displayInfo();
	}

	@Override
	public void checkInUsers() {
		this.row.checkInUsers();
	}

	@Override
	public void deleteMatch() {
		this.row.deleteMatch();
	}
	
	

}
