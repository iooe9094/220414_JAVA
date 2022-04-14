package ex02;

public class Child extends Parent {
	private int r = 300;
	
	public void display() {
		System.out.println("r = " + this.r);
	    System.out.println(getX());
	    System.out.println(getY());
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}
}
