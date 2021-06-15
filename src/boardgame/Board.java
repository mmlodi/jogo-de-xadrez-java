package boardgame;

public class Board {
	
	int rows;
	int columns;
	private Piece[][] pieces;
	
	
	public Board(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece[rows][columns];
	}
		

	public int getRows() {
		return rows;
	}



	public void setRows(int rows) {
		this.rows = rows;
	}



	public int getColumns() {
		return columns;
	}



	public void setColumns(int columns) {
		this.columns = columns;
	}



	public Piece piece( int row, int columns ) {
		return;
	}
	
	public Piece piece(Positon position) {
		return;
	}
	
	public void removePiece(Position position) {
		
	}
	
	public Piece positionExists(Position position) {
		return;
	}
	
	public boolean positionExists(Position position) {
		return;
	}

	public boolean ThereIsAPiece(Position position) {
		return;
	}
	
	
}
