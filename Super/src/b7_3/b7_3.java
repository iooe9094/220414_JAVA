package b7_3;

public class b7_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child2 c = new Child2();
		c.methods();
	}
}

class Parent2 {
	int x = 10;
}

class Child2 extends Parent2 {
	void methods() {
		System.out.println("x = " + x);
		System.out.println("this.x = " + this.x);
		System.out.println("super.x = " + super.x);
		// 출력값이 모두 10인 이유는 methods() 안에서 x값이 따로 정의되지 않았으므로
	}
}
