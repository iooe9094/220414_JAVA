package ex01;

public class Salesman extends Employee {
	public int record;
	
	// 기본 생성자
	public Salesman() {
		// 1. 부모의 생성자를 호출 : Employee() 실행 : 출력
		super();
		// 2. Salesman() 실행 : 출력
		System.out.println("Salesman() 실행");
	}
	
	// 매개변수 가지는 생성자
	public Salesman(int no, String name, int record) {
		// 3. 부모의 생성자를 호출 : Employee(int, String) 실행 : 출력
		super(no,name);
		// 4. Salesman(int, String, int) 실행 : 출력
		System.out.println("Salesman(" + no + "," + name + "," + record + ") 실행");
	}
}
