package gont.vlad.g1093;

import java.util.ArrayList;

import gont.vlad.g1093.dp.adapter.GoogleAuthFunctions;
import gont.vlad.g1093.dp.adapter.GoogleRegister;
import gont.vlad.g1093.dp.adapter.GoogleToStandardAdapter;
import gont.vlad.g1093.dp.adapter.InUseRegister;
import gont.vlad.g1093.dp.adapter.StandardRegister;
import gont.vlad.g1093.dp.builder.Game;
import gont.vlad.g1093.dp.builder.GameInterface;
import gont.vlad.g1093.dp.builder.User;
import gont.vlad.g1093.dp.decorator.CheckInButtonDecorator;
import gont.vlad.g1093.dp.decorator.DeleteButtonDecorator;
import gont.vlad.g1093.dp.decorator.InfoButtonDecorator;
import gont.vlad.g1093.dp.decorator.StandardTableRow;
import gont.vlad.g1093.dp.decorator.TableRow;
import gont.vlad.g1093.dp.factory.AbstractMessage;
import gont.vlad.g1093.dp.factory.MessageFactory;
import gont.vlad.g1093.dp.factory.MessageType;
import gont.vlad.g1093.dp.flyweight.AnimationProperties;
import gont.vlad.g1093.dp.flyweight.CardFactory;
import gont.vlad.g1093.dp.flyweight.CardShape;
import gont.vlad.g1093.dp.flyweight.DisplayableAnimation;
import gont.vlad.g1093.dp.prototype.GameCard;
import gont.vlad.g1093.dp.prototype.GameGraphicModel;
import gont.vlad.g1093.dp.proxy.RouteUser;
import gont.vlad.g1093.dp.proxy.RoutingInterface;
import gont.vlad.g1093.dp.proxy.RoutingProxy;
import gont.vlad.g1093.dp.singleton.AdminInterface;
import gont.vlad.g1093.dp.singleton.GoogleAuthentication;
import gont.vlad.g1093.dp.singleton.UserInterface;

public class TestAssignment {

	public static void main(String[] args) throws CloneNotSupportedException {

		// Singleton
		System.out.println("Singleton: ");
		GoogleAuthentication singletonInstance = GoogleAuthentication.getGoogleAuthenticationInstance();
		UserInterface userInstance = new UserInterface();
		AdminInterface adminInterface = new AdminInterface();

		// Simple factory
		System.out.println("\nSimple factory: ");
		AbstractMessage factoryMessage = MessageFactory.getMessage(MessageType.STANDARD, "Standard msg",
				"Some content for standard msg", "1/5/2021");
		factoryMessage.ConsoleLogMessage();

		factoryMessage = MessageFactory.getMessage(MessageType.BUG, "Bug msg", "Some content for bug msg", "2/5/2021");
		factoryMessage.ConsoleLogMessage();

		factoryMessage = MessageFactory.getMessage(MessageType.FEEDBACK, "Feedback msg",
				"Some content for feedback msg", "3/5/2021");
		factoryMessage.ConsoleLogMessage();

		factoryMessage = MessageFactory.getMessage(MessageType.OTHER, "Other msg", "Some content for other msg",
				"4/5/2021");
		factoryMessage.ConsoleLogMessage();

		// Builder
		System.out.println("\nBuilder: ");
		User userBuilder = new User.UserBuilder("Vlad Gont", "gontvlad18@stud.ase.ro").isAdmin().setGame(new Game())
				.updateAge(21).updatePhone("Some phone number").updateFacebook("Some facebook profile link")
				.useBuilder();
		System.out.println(userBuilder.toString());
		GameInterface game = userBuilder.getGameActions();
		game.createGame();
		game.participateAtGame();

		User userBuilder2 = new User.UserBuilder("Vlad Andrei Gont", "email").useBuilder();
		System.out.println(userBuilder2.toString());

		// Prototype
//		System.out.println("\nNo prototype: ");
//		GameCard noPrototype = new GameCard("Parcul Izvor", "02/05/2021", 1);
//		GameCard noPrototype1 = new GameCard("Parcul Izvor", "02/05/2021", 1);
//		GameCard noPrototype2 = new GameCard("Parcul Izvor", "02/05/2021", 1);
		System.out.println("\nPrototype: ");
		GameCard card = new GameCard("Parcul Izvor", "02/05/2021", 1);
		GameCard card2 = (GameCard) card.clone();
		GameCard card3 = (GameCard) card.clone();

		// Adapter
		System.out.println("\nAdapter: ");
		StandardRegister standardRegister = new InUseRegister("Vlad Gont", "email", 21, "telefon", "profile link");

		GoogleAuthFunctions googleRegister = new GoogleRegister("Vlad Andrei Gont", "email stud");

		ArrayList<StandardRegister> registers = new ArrayList<>();
		registers.add(standardRegister);
		GoogleToStandardAdapter googleAdapter = new GoogleToStandardAdapter(googleRegister);
		registers.add(googleAdapter);

		for (StandardRegister register : registers) {
			register.validate();
			register.useRESTBackEnd(register.getName(), register.getEmail(), register.getAge(), register.getPhone(),
					register.getFacebook());
		}
		
		
		// Decorator
		System.out.println("\nDecorator: ");
		TableRow row = new StandardTableRow(1,"Izvor park", "03/05/2021", "Vlad Gont");
		row.withdrawFromMatch();
		row.displayInfo();
		row.checkInUsers();
		row.deleteMatch();
		
		
		row = new InfoButtonDecorator(row);
		row.displayInfo();
		
		ArrayList<String> participants = new ArrayList<>();
		participants.add("Vlad Gont");		
		participants.add("Alt user");		
		participants.add("Al treilea user");		
		
		row = new CheckInButtonDecorator(row, participants);
		row.checkInUsers();
		
		row = new DeleteButtonDecorator(row);
		row.deleteMatch();
		
		
		// Flyweight
		System.out.println("\nFlyweight: ");
		
		AnimationProperties animation1 = new AnimationProperties("green and white");
		AnimationProperties animation2 = new AnimationProperties("red and purple");
		AnimationProperties animation3 = new AnimationProperties("black and yellow");
		AnimationProperties animation4 = new AnimationProperties("orange and white");
		
		DisplayableAnimation squareModel = CardFactory.getCard(CardShape.SQUARE);
		squareModel.displayAnimation(animation1);
		
		DisplayableAnimation rectangleModel = CardFactory.getCard(CardShape.RECTANGLE);
		rectangleModel.displayAnimation(animation2);
		
		DisplayableAnimation roundedModel = CardFactory.getCard(CardShape.ROUNDED);
		roundedModel.displayAnimation(animation3);
		roundedModel.displayAnimation(animation4);
		
		
		// Proxy
		System.out.println("\nProxy: ");
		gont.vlad.g1093.dp.proxy.User user = new gont.vlad.g1093.dp.proxy.User("Vlad Gont",
				"email", true);
		gont.vlad.g1093.dp.proxy.User userNormal = new gont.vlad.g1093.dp.proxy.User("Vlaf Gont",
				"email normal", false);
		
		RoutingInterface router = new RouteUser();
		for (int i = 0; i < 2; i++) {
			router.accessPage(user);
		}
		
		for (int i = 0; i < 2; i++) {
			router.accessPage(userNormal);
		}
		
		RoutingInterface proxyRouter = new RoutingProxy(new RouteUser());
		for (int i = 0; i < 2; i++) {
			proxyRouter.accessPage(user);
		}
		
		for (int i = 0; i < 2; i++) {
			proxyRouter.accessPage(userNormal);
		}
		
	}

}
