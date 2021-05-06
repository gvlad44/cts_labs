package gont.vlad.g1093.dp.factory;

public class Feedback extends AbstractMessage {

	public Feedback(String title, String content, String date, String feedbackPlace) {
		super(title, content, date);
	}

	@Override
	public void ConsoleLogMessage() {
		System.out.println(String.format("Message: title %s, content %s, date %s, feedback for a page", this.title,
				this.content, this.date));

	}

}
