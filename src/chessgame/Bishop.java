package chessgame;
import boardgame.Board;
import boardgame.Position;

public class Bishop extends ChessPiece {

	public Bishop(Board board, Color color) {
		super(board, color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "B";
	}

	@Override
	public boolean[][] possibleMoves() {
		boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
		
		Position p = new Position(0, 0);
		// Verificação NW
		p.setValues(position.getRow() - 1, position.getColumn() -1);
		while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p) ) {
			mat[p.getRow()][p.getColumn()] = true;
			p.setValues(p.getRow() - 1, p.getColumn() -1);
		}
		if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}
		
		// Verificação NE
		p.setValues(position.getRow() - 1, position.getColumn() +1);
		while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p) ) {
			mat[p.getRow()][p.getColumn()] = true;
			p.setValues(p.getRow() - 1, p.getColumn() +1);
		}
		if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}
		
		// Verificação SE
		p.setValues(position.getRow() +1, position.getColumn() + 1);
		while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p) ) {
			mat[p.getRow()][p.getColumn()] = true;
			p.setValues(p.getRow() + 1, p.getColumn() +1);
		}
		if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}
		
		// Verificação SW
		p.setValues(position.getRow() + 1, position.getColumn() -1);
		while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p) ) {
			mat[p.getRow()][p.getColumn()] = true;
			p.setValues(p.getRow() + 1, p.getColumn() -1);
		}
		if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}
		return mat;
	}
}
