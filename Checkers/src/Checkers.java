/**
 * An encapsulation of a checkers game.
 * 
 * @author Grant Schowalter
 *
 */
public class Checkers {

	private static Board board = new Board();
	private static int screenSize = 400;
	private static int spaceSize = screenSize / 8;

	public static void main(String[] args) {
		StdDraw.setCanvasSize(screenSize, screenSize);
		StdDraw.setXscale(0, screenSize);
		StdDraw.setYscale(0, screenSize);
		board.draw(screenSize);
		addPieces();
		drawPieces();
		while (true) {
			update();
		}

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

	public static void update() {
		selectPiece();
	}

	@SuppressWarnings({ "unlikely-arg-type", "deprecation" })
	public static void selectPiece() {
		if (StdDraw.mousePressed()) {
			if (!getSpaceOnMouseClick(StdDraw.mouseX(), StdDraw.mouseY()).getState().equals(State.EMPTY)) {

				if (getSpaceOnMouseClick(StdDraw.mouseX(), StdDraw.mouseY()).isHighlighted()) {
					getSpaceOnMouseClick(StdDraw.mouseX(), StdDraw.mouseY()).unhighlight();
					if (getSpaceOnMouseClick(StdDraw.mouseX(), StdDraw.mouseY()).getState().equals(State.BLUE)) {
						StdDraw.setPenColor(StdDraw.BLUE);
						StdDraw.filledCircle(getSpaceOnMouseClick(StdDraw.mouseX(), StdDraw.mouseY()).getCordinates().getX() * spaceSize
									+ spaceSize / 2,
							getSpaceOnMouseClick(StdDraw.mouseX(), StdDraw.mouseY()).getCordinates().getY() * spaceSize
									+ spaceSize / 2,
							spaceSize / 3);
					} else {
						StdDraw.setPenColor(StdDraw.RED);
						StdDraw.filledCircle(getSpaceOnMouseClick(StdDraw.mouseX(), StdDraw.mouseY()).getCordinates().getX() * spaceSize
								+ spaceSize / 2,
						getSpaceOnMouseClick(StdDraw.mouseX(), StdDraw.mouseY()).getCordinates().getY() * spaceSize
								+ spaceSize / 2,
						spaceSize / 3);
					}
				} else {
					getSpaceOnMouseClick(StdDraw.mouseX(), StdDraw.mouseY()).highlight();
					StdDraw.setPenColor(StdDraw.YELLOW);
					StdDraw.setPenRadius(0.003);
					StdDraw.filledCircle(
							getSpaceOnMouseClick(StdDraw.mouseX(), StdDraw.mouseY()).getCordinates().getX() * spaceSize
									+ spaceSize / 2,
							getSpaceOnMouseClick(StdDraw.mouseX(), StdDraw.mouseY()).getCordinates().getY() * spaceSize
									+ spaceSize / 2,
							spaceSize / 4);
				}

			}
		}
	}

	public static Space getSpaceOnMouseClick(double x, double y) {
		return board.getSpace((int) StdDraw.mouseX() / spaceSize, (int) StdDraw.mouseY() / spaceSize);
	}

}
