package chess;

import boardgame.Board;
import boardgame.Peace;

public class ChessPiece extends Peace {
	
	private Color color;

	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}
}
