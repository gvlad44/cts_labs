package gont.vlad.g1093.dp.flyweight;

public class GameCard implements DisplayableAnimation {

	private String cardShape;
	private String componentName;
	private int duration;

	public String getCardShape() {
		return cardShape;
	}

	public String getComponent() {
		return componentName;
	}

	public int getDuration() {
		return duration;
	}

	public GameCard(String cardShape, String components, int duration) {
		super();
		this.cardShape = cardShape;
		this.componentName = components;
		this.duration = duration;
	}

	@Override
	public void displayAnimation(AnimationProperties props) {
		System.out.println(
				String.format("Generating card %s with the shape %s," + " with the animation of color %s and lenght %d",
						this.componentName, this.cardShape, props.getColor(), this.duration));
	}

}
