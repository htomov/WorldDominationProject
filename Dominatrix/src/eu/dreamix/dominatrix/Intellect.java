package eu.dreamix.dominatrix;

public interface Intellect {
	
	public int getMove(Board board, int[] availableMoves);
	
	public void notifyOfResult(GameResult result);
	
	public Intellect crossover(Intellect partner);
	
}
