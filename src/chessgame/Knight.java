package chessgame;

import boardgame.Board;
import boardgame.Position;

public class Knight extends ChessPiece{

	public Knight(Board board, Color color) {
		super(board, color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "N";
	}

	private boolean canMove(Position position) {
		ChessPiece p = (ChessPiece)getBoard().piece(position);
		return p == null || p.getColor() != getColor();
	}
	
	@Override
	public boolean[][] possibleMoves() {
		boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
		
		
		Position p = new Position(0, 0);
		
		// Verificação ACIMA
		p.setValues(position.getRow() - 1, position.getColumn() - 2);
		if (getBoard().positionExists(p) && canMove(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}
		//if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
		//	mat[p.getRow()][p.getColumn()] = true;
		//}
		// Verificação ACIMA ESQUERDA
		p.setValues(position.getRow() - 2, position.getColumn() - 1);
		if (getBoard().positionExists(p) && canMove(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}
		//if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
		//	mat[p.getRow()][p.getColumn()] = true;
		//}
		// Verificação ACIMA DIREITA
		p.setValues(position.getRow() - 2, position.getColumn() + 1);
		if (getBoard().positionExists(p) && canMove(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}
		//if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
		//	mat[p.getRow()][p.getColumn()] = true;
		//}
		
		// Verificação ESQUERDA
		p.setValues(position.getRow() -1, position.getColumn() +2);
		if (getBoard().positionExists(p) && canMove(p) ) {
			mat[p.getRow()][p.getColumn()] = true;
		}
		//if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
		//	mat[p.getRow()][p.getColumn()] = true;
		//}
		
		// Verificação DIREITA
		p.setValues(position.getRow() +1, position.getColumn() + 2);
		if (getBoard().positionExists(p) && canMove(p) ) {
			mat[p.getRow()][p.getColumn()] = true;
		}
		//if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
		//	mat[p.getRow()][p.getColumn()] = true;
		//}
		
		// Verificação BAIXO
		p.setValues(position.getRow() + 2, position.getColumn()+1);
		if (getBoard().positionExists(p) && canMove(p) ) {
			mat[p.getRow()][p.getColumn()] = true;
		}
		//if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
		//	mat[p.getRow()][p.getColumn()] = true;
		//}
		// Verificação BAIXO ESQUERDA
		p.setValues(position.getRow() + 2, position.getColumn() -1);
		if (getBoard().positionExists(p) && canMove(p) ) {
			mat[p.getRow()][p.getColumn()] = true;
		}
		//if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
		//	mat[p.getRow()][p.getColumn()] = true;
		//}
		// Verificação BAIXO DIREITA
		p.setValues(position.getRow() + 1, position.getColumn() -2);
		if (getBoard().positionExists(p) && canMove(p) ) {
			mat[p.getRow()][p.getColumn()] = true;
		}
		//if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
		//	mat[p.getRow()][p.getColumn()] = true;
		//}
		return mat;
	}
}
