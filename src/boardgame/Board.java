package boardgame;

public class Board {
	
	int rows;
	int columns;
	private Piece[][] pieces;
	
	
	public Board(int rows, int columns) {
		if (rows < 1 || columns < 1) {
			throw new BoardException("Erro na criação do tabuleiro, ele deve ter pelo menos uma linha e uma coluna");
		}
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece[rows][columns];
	}
		

	public int getRows() {
		return rows;
	}


	public int getColumns() {
		return columns;
	}


	public Piece piece( int row, int column ) {
		if (!positionExists(row,column)) {
			throw new BoardException("Insira uma posição válida no tabuleiro");
		}
		return pieces[row][column];
	}
	
	//Retorna as peças que estão em tal posição
	public Piece piece(Position position) {
		if (!positionExists(position)) {
			throw new BoardException("Insira uma posição válida no tabuleiro");
		}
		return pieces[position.getRow()][position.getColumn()];
	}
	
	public void placePiece(Piece piece, Position position) {
		if (thereIsAPiece(position)) {
			throw new BoardException("Já existe uma peça nessa posição: " + position );
		}
		pieces[position.getRow()][position.getColumn()] = piece;
		piece.position = position;
	}
	
	
	private boolean positionExists(int row, int column) {
		return row >= 0 && row < rows && column >= 0 && column <columns;
	}
	
	public boolean positionExists(Position position) {
		return positionExists(position.getRow(), position.getColumn());
	}

	public boolean thereIsAPiece(Position position) {
		if (!positionExists(position)) {
			throw new BoardException("Insira uma posição válida no tabuleiro");
		}
		return piece(position) != null;
	}
	
	public void removePiece(Position position) {
		
	}
	
	
}
