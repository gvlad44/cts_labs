package gont.vlad.g1093.dp.factory;

public class MessageFactory {

	public static AbstractMessage getMessage(MessageType msgType, String title, String content, String date) {
		AbstractMessage message = null;

		switch (msgType) {
		case STANDARD: {
			message = new StandardMessage(title, content, date);
			break;
		}

		case BUG: {
			message = new Bug(title, content, date, "Interface malfunction");
			break;
		}

		case FEEDBACK: {
			message = new Feedback(title, content, date, "Great layout");
			break;
		}

		case OTHER: {
			message = new Other(title, content, date, true);
			break;
		}

		default:
			throw new UnsupportedOperationException();
		}

		return message;
	}

}
