package eu.dreamix.dominatrix;

public class PlayerResult {
	private Intellect player;
	private int score;
	
	public PlayerResult(Intellect player, int score) {
		super();
		this.player = player;
		this.score = score;
	}
	public Intellect getPlayer() {
		return player;
	}
	public int getScore() {
		return score;
	}
	
	
}
