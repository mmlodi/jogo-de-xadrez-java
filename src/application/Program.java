package application;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import chessgame.ChessException;
import chessgame.ChessMatch;
import chessgame.ChessPiece;
import chessgame.ChessPosition;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ChessMatch chessMatch = new ChessMatch();
		List<ChessPiece> captured = new ArrayList<>();
		
		
		
		while (!chessMatch.getCheckMate()) {
			try {
				UI.clearSreen();
				UI.printMatch(chessMatch, captured);
				System.out.println();
				System.out.println("Source: ");
				ChessPosition source = UI.readChessPosition(sc);
				
				boolean[][] possibleMoves = chessMatch.possibleMoves(source);
				UI.clearSreen();
				UI.printBoard(chessMatch.getPieces(), possibleMoves);
				
				System.out.println();
				System.out.println("Target: ");
				ChessPosition target = UI.readChessPosition(sc);
				
				ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
		
				if (capturedPiece != null) {
					captured.add(capturedPiece);
					
				}
			}
			catch (ChessException e) {
				System.out.println(e.getMessage());
				sc.nextLine();
			}
			catch (InputMismatchException e) {
				System.out.println(e.getMessage());
				sc.nextLine();
			}
		}
		UI.clearSreen();
		UI.printMatch(chessMatch, captured);
	}

}
