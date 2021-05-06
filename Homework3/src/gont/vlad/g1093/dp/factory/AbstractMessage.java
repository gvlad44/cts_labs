package gont.vlad.g1093.dp.factory;

public abstract class AbstractMessage {

	String title;
	String content;
	String date;

	public AbstractMessage(String title, String content, String date) {
		super();
		this.title = title;
		this.content = content;
		this.date = date;
	}

	public abstract void ConsoleLogMessage();

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

}
