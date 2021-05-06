package gont.vlad.g1093.dp.prototype;

import java.util.ArrayList;

public abstract class GameGraphicModel implements Cloneable {

	String place;
	String date;
	int creatorId;

	ArrayList<Integer> animationDurationBetweenStepsInSeconds = new ArrayList<>();

	public GameGraphicModel() {

	}

	public GameGraphicModel(String place, String date, int creatorId) {
		this.place = place;
		this.date = date;
		this.creatorId = creatorId;
		System.out.println("Fetching and displaying animation");

		try {
			Thread.sleep(4000);
			for (int steps = 0; steps < 10; steps++) {
				if (steps / 2 == 1) {
					int integer = this.creatorId + this.place.length() + steps;
					animationDurationBetweenStepsInSeconds.add(integer);
				} else {
					int integer = this.creatorId + this.place.length() - steps;
					animationDurationBetweenStepsInSeconds.add(integer);
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	public String getPlace() {
		return place;
	}

	public String getDate() {
		return date;
	}

	public int getCreatorId() {
		return creatorId;
	}

	public ArrayList<Integer> getAnimationDurationBetweenStepsInSeconds() {
		return animationDurationBetweenStepsInSeconds;
	}

	public abstract Object clone();

}
