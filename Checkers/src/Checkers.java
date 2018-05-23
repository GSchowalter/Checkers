/**
 * An encapsulation of a checkers game.
 * @author Grant Schowalter
 *
 */
public class Checkers {

	private static Board board = new Board();
	private static int screenSize = 400;
	
	public static void main(String[] args)
	{
		StdDraw.setCanvasSize(screenSize, screenSize);
		StdDraw.setXscale(0, screenSize);
		StdDraw.setYscale(0, screenSize);
		board.draw(screenSize);
	}
	
	
}
