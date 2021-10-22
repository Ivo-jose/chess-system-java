package application;

import chess.ChessMatch;

public class Program {

	public static void main(String[] args) {
		
		System.out.println();
		ChessMatch chessmatch = new ChessMatch();
		UI.printBoard(chessmatch.getPieces());
		
	}

}
