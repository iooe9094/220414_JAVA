package ex01;

public class Student extends Person {
	public void set() {
	    // 캡슐화 : 외부에 변수들만 노출시키고 자식요소에 내용 추가
		age = 30; // default 접근 가능
		name = "홍길동"; // public 접근 가능
		height = 175; // protected(상속) 접근 가능
//		weight = 99; // private 접근 불가 오류 발생
		setWeight(99); // public 메소드이므로 접근 가능
	}
}
