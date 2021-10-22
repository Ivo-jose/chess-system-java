package boardgame;

public class Piece {

	//Attributes
	protected Position position;
	//Association
	private Board board;
	
	//Constructor
	public Piece(Board board) {
		this.board = board;
		position = null;
	}
	
	//Method Getter
	protected Board getBoard() {
		return board;
	}
	
}
