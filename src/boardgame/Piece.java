package boardgame;

public abstract class Piece {
	
		protected Position position;
		private Board board;
		
		
		public Piece(Board board) {
			this.board = board;
			position = null;
		}

		
		protected Board getBoard() {
			return board;
		}


		
		
		public abstract possibleMoves() {
			return boolean;
		}
		
		public boolean possibleMove(Position position) {
			return  position;
		}
		
		public boolean isThereAnyPossibleMove() {
			return ;
		}
}
