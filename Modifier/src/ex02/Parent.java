package ex02;

// private 사용하려면 setter, getter 가져와야함
public class Parent {
	private int x = 100;
	private int y = 200;
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
}
