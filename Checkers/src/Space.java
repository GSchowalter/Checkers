
public class Space {

	State state;

	public Space() {
		state = State.EMPTY;
	}

	public State getState() {
		return this.state;
	}

	public void setState(State newState) {
		this.state = newState;
	}
}
