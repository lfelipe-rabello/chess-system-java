package boardgame;

public class Peace {
	
	protected Position position;
	private Board board;
	
	public Peace(Board board) {
		this.board = board;
	}

	protected Board getBoard() {
		return board;
	}
	
}
