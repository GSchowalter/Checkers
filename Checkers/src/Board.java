/**
 * An Encapsulation of a checker board
 * 
 * @author Grant Schowalter
 * @version 1.0.0
 *
 */
public class Board {

	private boolean[][] spaces = new boolean[8][8];

	public boolean getSpace(int x, int y) {
		return spaces[x][y];
	}

	public void draw(int size) {
		int spaceSize = size / 8;
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				if ((i % 2) == 0) {
					if ((j % 2) == 0) {
						StdDraw.setPenColor(StdDraw.BLACK);
						StdDraw.filledSquare(i * spaceSize + spaceSize / 2, j * spaceSize + spaceSize / 2,
								spaceSize / 2);
					}

					if (j % 2 == 1) {
						StdDraw.setPenColor(StdDraw.WHITE);
						StdDraw.filledSquare(i * spaceSize + spaceSize / 2, j * spaceSize + spaceSize / 2,
								spaceSize / 2);
					}
				}
				if ((i % 2) == 1) {
					if ((j % 2) == 1) {
						StdDraw.setPenColor(StdDraw.BLACK);
						StdDraw.filledSquare(i * spaceSize + spaceSize / 2, j * spaceSize + spaceSize / 2,
								spaceSize / 2);
					}

					if (j % 2 == 0) {
						StdDraw.setPenColor(StdDraw.WHITE);
						StdDraw.filledSquare(i * spaceSize + spaceSize / 2, j * spaceSize + spaceSize / 2,
								spaceSize / 2);
					}
				}
			}
		}
	}
}
