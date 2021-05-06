package ro.ase.csie.cts.g1093.dp.strategy;

public class Player {

	String username;
	int playTime;
	int xpPoints;
	
	BonusStrategyInterface bonusCampaign = null;
	
	
	
	public void setBonusCampaign(BonusStrategyInterface bonusCampaign) {
		this.bonusCampaign = bonusCampaign;
	}

	public Player(String username, int playTime, int xpPoints) {
		super();
		this.username = username;
		this.playTime = playTime;
		this.xpPoints = xpPoints;
	}
	
	public void getXPPoints(int pointsReceived) {
		if(this.bonusCampaign !=null) {
			this.bonusCampaign.getBonusPoints(pointsReceived, this);
		}
	}
	
}
