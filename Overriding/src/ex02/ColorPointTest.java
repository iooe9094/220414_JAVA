package ex02;

public class ColorPointTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Point 객체 생성
		Point p = new Point();
		
		// 좌표가 설정됨
		p.set(1,2);
		
		// 좌표 출력 메소드 호출
		p.showPoint();
		
		// ColorPoint 객체 생성
		ColorPoint cp = new ColorPoint();
		
		// Point로부터 상속 받았으므로 Set() 메소드 사용 가능
		cp.set(3,4);
		
		cp.setColor("red");
		
		// 좌표 및 색상 정보 출력
		cp.showColorPoint();
	}

}
