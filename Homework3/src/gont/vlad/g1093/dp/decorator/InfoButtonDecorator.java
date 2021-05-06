package gont.vlad.g1093.dp.decorator;

public class InfoButtonDecorator extends RowDecorator {

	public InfoButtonDecorator(TableRow row) {
		super(row);
	}

	@Override
	public void displayInfo() {
		System.out.println(String.format("Displaying info for match creator %s %s %s", this.row.getMatchId(),
				this.row.getPlace(), this.row.getDate()));
	}

	

}
