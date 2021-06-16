package chessgame;

import boardgame.Board;
import boardgame.Piece;

public abstract class ChessPiece extends Piece {
	private Color color;
	int moveCount;
	
	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}


	public Color getColor() {
		return color;
	}


	public ChessPosition getChessPosition() {
		return ;
	}
	
	
}

