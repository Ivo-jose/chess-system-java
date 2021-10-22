package boardgame;

public class Position {

	//Attributes
	private int row;
	private int column;
	
	//Constructor
	public Position(int row, int column) {
		this.row = row;
		this.column = column;
	}

	//Methods Getters 
	public int getRow() {
		return row;
	}

	public int getColumn() {
		return column;
	}
	
	//Class operation
	public void setValues(int row, int column) {
		this.row = row;
		this.column = column;
	}
	
	//Print position on screen
	@Override
	public String toString() {
		return row +", "+column;
	}
}