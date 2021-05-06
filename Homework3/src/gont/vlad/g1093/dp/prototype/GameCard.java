package gont.vlad.g1093.dp.prototype;

import java.util.ArrayList;

public class GameCard extends GameGraphicModel {

	public GameCard(String place, String date, int creatorId) {
		super(place, date, creatorId);
		System.out.println("Animation started displaying");
	}

	private GameCard() {
		System.out.println("Animation started displaying");
	}

	@Override
	public Object clone() {
		GameCard card = new GameCard();
		card.creatorId = this.creatorId;
		card.place = this.place;
		card.date = this.date;
		card.animationDurationBetweenStepsInSeconds = (ArrayList<Integer>) 
				this.animationDurationBetweenStepsInSeconds.clone();

		return card;
	}

}
