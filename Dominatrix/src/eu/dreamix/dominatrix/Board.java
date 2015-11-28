package eu.dreamix.dominatrix;

public class Board {
	
	public Board(int size) {
		super();
		this.size = size;
		board= new int[size][size];
	}
	private int size;
	private int[][] board;
	public int getSize(){
		return size;
	};
	public int get(int x, int y){
		return board[x][y];
	};
	public int get(int x){
		return board[x / size][x % size];
	};
	
}
