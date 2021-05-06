package gont.vlad.g1093.dp.factory;

public class StandardMessage extends AbstractMessage {

	public StandardMessage(String title, String content, String date) {
		super(title, content, date);

	}

	@Override
	public void ConsoleLogMessage() {
		System.out
				.println(String.format("Message: title %s, content %s, date %s", this.title, this.content, this.date));
	}

}
