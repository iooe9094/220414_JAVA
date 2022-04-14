package b7_2;

public class b7_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c = new Child();
		c.methods();
	}
}

class Parent { 
	int x = 10; 
	}

class Child extends Parent {
	int x = 20;
	void methods() {
		System.out.println("x = " + x);
		System.out.println("this.x = " + this.x);
		System.out.println("super.x = " + super.x); // 부모인 Parent의 x값 출력
	}
}
