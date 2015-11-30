package eu.dreamix.dominatrix;

public class Move {
	public int x;
	public int y;
	public int player;
	
	
	public Move(int x, int y, int player) {
		this.x = x;
		this.y = y;
		this.player=player;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public Move up(){
		return new Move(x, y-1, player);
	}

	public Move down(){
		return new Move(x, y+1, player);
	}

	public Move left(){
		return new Move(x-1, y, player);
	}

	public Move right(){
		return new Move(x+1, y, player);
	}

	public Move up_left(){
		return new Move(x-1, y-1, player);
	}

	public Move up_right(){
		return new Move(x+1, y-1, player);
	}
	
	public Move down_left(){
		return new Move(x-1, y+1, player);
	}
	
	public Move down_right(){
		return new Move(x+1, y+1, player);
	}
	
	public int getPlayer() {
		return player;
	}

	public void setPlayer(int player) {
		this.player = player;
	}

	@Override
	public String toString() {
		return "X: " + getX()+ ", Y: "+ getY();
	}
}
