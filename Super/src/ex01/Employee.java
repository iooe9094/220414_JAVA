package ex01;

public class Employee {
	
    public int x;
	public String y;
	
	// 기본 생성자
	public Employee() {
		System.out.println("Employee() 실행");
		
	}
	
	// 매개변수를 갖는 생성자
	public Employee(int x, String y) {
		this.x = x;
		this.y = y;
		System.out.println("Employee(int, String) 실행");
	}



}
