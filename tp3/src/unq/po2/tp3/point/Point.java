package unq.po2.tp3.point;

public class Point {
	
	private int x;
	private int y;
	
	public Point() {
		initializeX();
		initializeY();
	}

	public Point(int xCoordenate, int yCoordenate) {
		initializeX(xCoordenate);
		initializeY(yCoordenate);
	}
	
	public int getX() {
		return this.x;
	}

	public int getY() {
		return this.y;
	}

	private void initializeY(int yCoordenate) {
		this.y = yCoordenate;
	}

	private void initializeX(int xCoordenate) {
		this.x = xCoordenate;
	}

	private void initializeY() {
		this.y = 0;
	}

	private void initializeX() {
		this.x = 0;
	}
	
	private void setY(int coordenateY) {
		this.y = coordenateY;
		
	}

	private void setX(int coordenateX) {
		this.x = coordenateX;
	}

	public void MoveTo(int coordenateX, int coordenateY) {
		setX(coordenateX);
		setY(coordenateY);
	}

	public void sumTo(Point point) {
		setX(sumXTo(point));
		setY(sumYTo(point));
		
	}

	private int sumYTo(Point point) {
		return getY() + point.getY();
	}

	private int sumXTo(Point point) {
		return getX() + point.getX();
	}
}
