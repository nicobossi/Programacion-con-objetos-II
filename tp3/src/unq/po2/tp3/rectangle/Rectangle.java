package unq.po2.tp3.rectangle;

import unq.po2.tp3.point.Point;

public class Rectangle {
	
	private Point location;
	private int width;
	private int height;

	public Rectangle(Point aPoint, int width, int height) {
		setPoint(aPoint);
		setWidth(width);
		setHeight(height);
	}
	
	public int xCoordenate() {
		return getLocation().getX();
	}
	
	public int yCoordenate() {
		return getLocation().getY();
	}
	
	public int perimeter() {
		return 2 * sumSides();
	}

	public int area() {
		return getWidth() * getHeight();
	}
	
	public boolean isVertical() {
		return getHeight() > getWidth();
	}

	public boolean isHorizontally() {
		return getWidth() > getHeight();
	}

	private void setHeight(int height) {
		this.height = height;
	}

	private void setWidth(int width) {
		this.width = width;
	}

	private void setPoint(Point aPoint) {
		this.location = aPoint;
	}

	protected int getHeight() {
		return this.height;
	}

	protected int getWidth() {
		return this.width;
	}

	private int sumSides() {
		return getWidth() + getHeight();
	}

	private Point getLocation() {
		return this.location;
	}
}
