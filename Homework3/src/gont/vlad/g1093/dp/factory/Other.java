package gont.vlad.g1093.dp.factory;

public class Other extends AbstractMessage {

	public Other(String title, String content, String date, Boolean editor) {
		super(title, content, date);
	}

	@Override
	public void ConsoleLogMessage() {
		System.out.println(String.format("Message: title %s, content %s, date %s and it used an editor.", this.title,
				this.content, this.date));

	}

}
