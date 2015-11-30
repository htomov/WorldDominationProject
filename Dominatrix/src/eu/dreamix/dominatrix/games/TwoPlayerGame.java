package eu.dreamix.dominatrix.games;

import eu.dreamix.dominatrix.Board;
import eu.dreamix.dominatrix.Game;
import eu.dreamix.dominatrix.GameResult;
import eu.dreamix.dominatrix.Intellect;
import eu.dreamix.dominatrix.Move;
import eu.dreamix.dominatrix.PlayerResult;

public abstract  class TwoPlayerGame implements Game{

	protected static int  WIN_SCORE=3;
	protected static int  DRAW_SCORE=1;
	protected static int  LOSE_SCORE=0;
	Intellect player1;
	Intellect player2;
	Board board = new Board(getBoardSize());
	
	@Override
	public PlayerResult[] play(Intellect... players) {
		player1=players[0];
		player2=players[1];
	
		
		
		
		GameResult moveResult = GameResult.NOT_OVER;
		Intellect currentPlayer = player1;
		while(moveResult==GameResult.NOT_OVER){
			Move[] availableMoves = getAvailableMoves();
			Move move = currentPlayer.getMove(board, availableMoves);
			moveResult = makeMove(move);
			currentPlayer= currentPlayer==player1 ?  player2 : player1;
		}
		
		PlayerResult result1 = null;
		PlayerResult result2 = null;
		if(moveResult == GameResult.DRAW){
			result1 = new PlayerResult(player1, DRAW_SCORE);
			result2 = new PlayerResult(player2, DRAW_SCORE);
		} else{
			result2 = new PlayerResult(currentPlayer, LOSE_SCORE);
			currentPlayer= currentPlayer==player1 ?  player2 : player1;
			result1 = new PlayerResult(currentPlayer, WIN_SCORE);
		}
		
		
		return new PlayerResult[]{ result1, result2 };
	}

	protected abstract GameResult  makeMove(Move move) ;

	protected abstract Move[] getAvailableMoves();

	protected abstract int getBoardSize() ;

}
