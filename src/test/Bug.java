package test;

public class Bug {

	private int position;
	private int direction = 1;
	
	public Bug(int initialPosition) {
		this.position = initialPosition;
	}
	
	public void turn() {
		if(direction == 1) {
			direction = -1;
		}
		else {
			direction = 1;
		}
	}
	
	public int getPosition() {
		return position;
	}
	
	public void move() {
		position += direction;
	}
}
