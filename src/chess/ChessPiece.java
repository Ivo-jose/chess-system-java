package chess;

import boardgame.Board;
import boardgame.Piece;

public class ChessPiece extends Piece{
	
	//Attributes
	private Color color;
	
	//Constructor
	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}
	
	//Method Getter
	public Color getColor() {
		return color;
	}

	
	

}
