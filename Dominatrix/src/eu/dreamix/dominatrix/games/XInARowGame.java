package eu.dreamix.dominatrix.games;

import eu.dreamix.dominatrix.Board;
import eu.dreamix.dominatrix.GameResult;
import eu.dreamix.dominatrix.Move;


public  abstract class XInARowGame extends TwoPlayerGame {

	@Override
	protected GameResult makeMove(Move move) {
		board.set(move.getX(), move.getY(), move.getPlayer());
//		for (Iterator iter = listeners.iterator(); iter.hasNext();) {
//			IntellectVisualizerAdapter iva = (IntellectVisualizerAdapter) iter.next();
//			iva.notifyMovePlayed(board);
//		}
		return null;
	}





	
	protected boolean isWinning(Move move) {
		int sqType = getSquare(move);

		// Vertical
		int count = 1;
		Move current = move.up();
		while (getSquare(current) == sqType) {
			count++;
			current = current.up();
		}
		current = move.down();
		while (getSquare(current) == sqType) {
			count++;
			current = current.down();
		}

		if (count == getCountToWin())
			return true;

		// Horizontal
		count = 1;
		current = move.left();
		while (getSquare(current) == sqType) {
			count++;
			current = current.left();
		}
		current = move.right();
		while (getSquare(current) == sqType) {
			count++;
			current = current.right();
		}

		if (count == getCountToWin())
			return true;

		// Diagonal 1
		count = 1;
		current = move.up_left();
		while (getSquare(current) == sqType) {
			count++;
			current = current.up_left();
		}
		current = move.down_right();
		while (getSquare(current) == sqType) {
			count++;
			current = current.down_right();
		}

		if (count == getCountToWin())
			return true;

		// Diagonal 2
		count = 1;
		current = move.up_right();
		while (getSquare(current) == sqType) {
			count++;
			current = current.up_right();
		}
		current = move.down_left();
		while (getSquare(current) == sqType) {
			count++;
			current = current.down_left();
		}

		if (count == getCountToWin())
			return true;

		return false;
	}
	
	protected abstract int getCountToWin();

	public int getSquare(Move move) {
		if (move.getX() < 0 || move.getY() < 0 || move.getX() >= getBoardSize()
				|| move.getY() >= getBoardSize())
			return Board.BORDER;
		return board.get(move.getX(), move.getY());
	}

	public void playMove(Move m, int player) {
		board.set(m.getX(), m.getY(), player);
//		for (Iterator iter = listeners.iterator(); iter.hasNext();) {
//			IntellectVisualizerAdapter iva = (IntellectVisualizerAdapter) iter.next();
//			iva.notifyMovePlayed(board);
//		}
	}
	
	
}
