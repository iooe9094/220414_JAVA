package ex03;

public class Gold extends Normal {
	
	@Override // 가독성 높게 + 개발자의 실수 줄이도록 표기
	// show가 w가 빠진 sho로 되어있으면 오류에 override 안되었다고 생성됨
	public void show() {
		id = 2;
		name = "lee";
		rank = "Gold";
		System.out.println("id = " + id + " name = " + name + " rank = " + rank);
}
}
