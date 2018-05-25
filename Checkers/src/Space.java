
public class Space {

	private State state;
	private Point cordinates;
	private boolean highlighted;

	public Space(int x, int y) {
		state = State.EMPTY;
		cordinates = new Point(x, y);
		highlighted = false;
	}

	public State getState() {
		return this.state;
	}

	public void setState(State newState) {
		this.state = newState;
	}
	
	public String getCordinatesString()
	{
		return String.format("%d , %d", cordinates.getX(), cordinates.getY());
	}
	
	public Point getCordinates()
	{
		return this.cordinates;
	}
	
	public boolean isHighlighted()
	{
		return highlighted;
	}
	
	public void highlight()
	{
		highlighted = true;
	}
	
	public void unhighlight()
	{
		highlighted = false;
	}
}
