package eu.dreamix.dominatrix;

public class Board {
	public static int BORDER = Integer.MIN_VALUE;
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
	
	public void set(int x, int y, int value){
		board[x][y]=value;
	}
	
	public void set(int x, int value){
		board[x / size][x % size]=value;
	}
	
}
