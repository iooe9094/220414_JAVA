package ex05;

public class Point {
	public int x, y; // 좌표 저장 값
	
	// 기본 생성자 : 초기화 목적
	public Point() {
		this.x = 0;
		this.y = 0;
	}
	
	// 매개변수가 있는 생성자
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// 좌표 출력 메소드
	public void showPoint() {
		System.out.println("(" + x + "," + y +")");
	}
}
