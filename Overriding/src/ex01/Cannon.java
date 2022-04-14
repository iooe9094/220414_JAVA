package ex01;

public class Cannon extends Weapon{
	
	@Override // 해당 대상이 오버라이딩 대상인 것을 표기해서 가독성 높임
	public int fire() {
		return 10; // 대포는 한번에 10명을 살상
	}

}
