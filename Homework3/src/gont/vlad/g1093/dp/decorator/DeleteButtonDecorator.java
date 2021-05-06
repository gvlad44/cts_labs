package gont.vlad.g1093.dp.decorator;

public class DeleteButtonDecorator extends RowDecorator{

	public DeleteButtonDecorator(TableRow row) {
		super(row);
	}
	
	@Override
	public void deleteMatch() {
		System.out.println(String.format("Deleting match %s from the database", this.row.getMatchId()));
	}

}
