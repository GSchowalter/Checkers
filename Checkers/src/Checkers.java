/**
 * An encapsulation of a checkers game.
 * 
 * @author Grant Schowalter
 *
 */
public class Checkers {

	private static Board board = new Board();
	private static int screenSize = 400;

	public static void main(String[] args) {
		StdDraw.setCanvasSize(screenSize, screenSize);
		StdDraw.setXscale(0, screenSize);
		StdDraw.setYscale(0, screenSize);
		board.draw(screenSize);
		addPieces();
		drawPieces();

	}

	public static void addPieces() {
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				if (j < 3) {
					if ((i % 2) == 0) {
						if ((j % 2) == 0) {
							board.getSpace(i, j).setState(State.BLUE);
						}
					}
					if ((i % 2) == 1) {
						if ((j % 2) == 1) {
							board.getSpace(i, j).setState(State.BLUE);
						}
					}
				}
				if (j > 4) {
					if ((i % 2) == 0) {
						if ((j % 2) == 0) {
							board.getSpace(i, j).setState(State.RED);
						}
					}
					if ((i % 2) == 1) {
						if ((j % 2) == 1) {
							board.getSpace(i, j).setState(State.RED);
						}
					}
				}
			}
		}
	}

	public static void drawPieces() {

		int spaceSize = screenSize / 8;

		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				if (board.getSpace(i, j).getState().equals(State.BLUE)) {
					StdDraw.setPenColor(StdDraw.BLUE);
					StdDraw.filledCircle(i * spaceSize + spaceSize / 2, j * spaceSize + spaceSize / 2, spaceSize / 2);
				}
				
				if (board.getSpace(i, j).getState().equals(State.RED)) {
					StdDraw.setPenColor(StdDraw.RED);
					StdDraw.filledCircle(i * spaceSize + spaceSize / 2, j * spaceSize + spaceSize / 2, spaceSize / 2);
				}
			}
		}
	}
}
