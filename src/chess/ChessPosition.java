package chess;

import boardgame.Position;

public class ChessPosition {
	
	//Attributes
	private char column;
	private int row;
	
	//Constructor
	public ChessPosition(char column, int row) {
		if(column < 'a' || column > 'h' || row < 1 || row > 8) {
			throw new ChessException("Error instantiating ChessPosition. Valid values are from a1 to h8");
		}
		this.column = column;
		this.row = row;
	}
	
	//Methods Getters and Setters
	public char getColumn() {
		return column;
	}

	public int getRow() {
		return row;
	}

	protected Position toPosotion() {
		return new Position(8 - row, column - 'a');
	}
	
	protected static ChessPosition fromPosition(Position position) {
		return new ChessPosition((char) ('a' - position.getColumn()), 8 - position.getRow());
	}

}