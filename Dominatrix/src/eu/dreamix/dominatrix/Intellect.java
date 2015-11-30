package eu.dreamix.dominatrix;

public interface Intellect {
	
	public Move getMove(Board board, Move[] availableMoves);
	
	public void notifyOfResult(GameResult result);
	
	public Intellect crossover(Intellect partner);
	
}
