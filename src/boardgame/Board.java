package boardgame;

public class Board {

	//Attributes
	private int rows;
	private int columns;
	//Association
	private Piece[][] pieces;
	
	//Constructor
	public Board(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece[rows][columns];
	}

	//Methods Getters and Setters
	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getColumns() {
		return columns;
	}

	public void setColumns(int columns) {
		this.columns = columns;
	}
	
	
	
}
