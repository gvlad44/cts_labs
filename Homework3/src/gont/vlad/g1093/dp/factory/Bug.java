package gont.vlad.g1093.dp.factory;

public class Bug extends AbstractMessage {

	public Bug(String title, String content, String date, String page) {
		super(title, content, date);
	}

	@Override
	public void ConsoleLogMessage() {
		System.out.println(String.format("Message: title %s, content %s, date %s, reported for an action", this.title,
				this.content, this.date));

	}

}
