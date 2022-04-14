package ex05;

// 파일 생성 할 때 Superclass에 상속받을 파일 이름 넣으면 자동으로 생성
public class ColorPoint extends Point {
	public String color; // 색상정보 멤버 변수

	// ColorPoint 생성자 : 매개변수 3개 짜리
	// 기본 생성자의 목적 : 초기화
	public ColorPoint(int a, int b, String color) {
		// 부모의 생성자를 호출해서 초기화
		// super 안의 a,b는 부모인 Point의 public int x, y 초기화를 의미함
		super(a,b);
		// 자식의 멤버 변수 초기화
		this.color = color;
	}
	
	// 색상정보와 좌표정보를 출력하는 메소드
	void showColorPoint() {
		System.out.print(color);
		// 부모인 Point를 상속 받았으므로 사용 가능
		showPoint();
	}
}
