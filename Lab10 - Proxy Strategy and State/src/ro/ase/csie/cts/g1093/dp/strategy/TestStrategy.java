package ro.ase.csie.cts.g1093.dp.strategy;

public class TestStrategy {

	public static void main(String[] args) {
	Player player = new Player("Dani", 10, 100);
	player.setBonusCampaign(new NoCampaign());
	player.getXPPoints(150);
	
	System.out.println(player.xpPoints);
	
	player.setBonusCampaign(new EasterCampaign());
	player.getXPPoints(150);
	
	System.out.println(player.xpPoints);
	
	player.setBonusCampaign(new SummerCampaign());
	player.getXPPoints(150);
	
	System.out.println(player.xpPoints);
	
	}
	
}
