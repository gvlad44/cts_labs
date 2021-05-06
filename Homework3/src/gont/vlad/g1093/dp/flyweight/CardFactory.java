package gont.vlad.g1093.dp.flyweight;

import java.util.HashMap;
import java.util.Map;

public class CardFactory {

	static Map<String, GameCard> cards = new HashMap<String, GameCard>();

	static {
		cards.put(CardShape.RECTANGLE.toString(), new GameCard("Rectangle", "single", 100));
		cards.put(CardShape.SQUARE.toString(), new GameCard("Square", "single", 150));
		cards.put(CardShape.ROUNDED.toString(), new GameCard("Rounded", "normal", 200));
	}
	
	public static DisplayableAnimation getCard(CardShape shape) {
		return cards.get(shape.toString());
	}
	
}
