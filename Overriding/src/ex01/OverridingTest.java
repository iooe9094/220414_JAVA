package ex01;

public class OverridingTest {

	public static void main(String[] args) {
		// 객체 만들기
		Weapon weapon = new Weapon();
		
		System.out.println("기본 무기의 살상 능력은 " + weapon.fire());
		
		Cannon cannon = new Cannon();
		
		System.out.println("대포의 살상 능력은 " + cannon.fire());
		// Cannon은 Weapon에게 상속 받았지만, 출력은 자식 Cannon이 출력
		// fire()라는 함수가 같은 상태에서 Weapon은 1, Cannon은 10일 때, 10이 출력

	}

}
