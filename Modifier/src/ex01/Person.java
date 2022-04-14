package ex01;

public class Person {
	private int weight;   // private   : 다른 클래스에서 접근 불가
	int age;              // default   : 같은 패키지에 있는 클래스만 접근 가능 (생략 가능)
	protected int height; // protected : 상속 받는 클래스만 접근 가능
    public String name;   // public    : 다른 패키지 포함해서 모두 접근 가능
	
    // setter (저장)
    public void setWeight(int weight) {
    	this.weight = weight;
    }
    
    // getter (불러오기)
    public int getWeight() {
    	return weight;
    }
}
