package boardgame;

public class Board {
	
	private int rowns;
	private int columns;
	private Peace[][] pieces;
	public Board(int rowns, int columns) {
		this.rowns = rowns;
		this.columns = columns;
		pieces = new Peace [rowns][columns];
	}
	public int getRowns() {
		return rowns;
	}
	public void setRowns(int rowns) {
		this.rowns = rowns;
	}
	public int getColumns() {
		return columns;
	}
	public void setColumns(int columns) {
		this.columns = columns;
	}
	
	
	
}
