package ex04;

class 동물 {
	
}

class 조류 extends 동물 {
	
}

class 펭귄 extends 조류 {
	
}

public class Driver {

	public static void main(String[] args) {
		// 펭귄 < 조류 < 동물 순으로 포함되어 있으므로 모두 true가 나온다
		
		동물 동물객체 = new 동물();
		조류 조류객체 = new 조류();
		펭귄 펭귄객체 = new 펭귄();
		
		System.out.println(동물객체 instanceof 동물);
		
	    System.out.println("============");
	    
		System.out.println(조류객체 instanceof 동물);
		System.out.println(조류객체 instanceof 조류);
		
		System.out.println("============");
		
		System.out.println(펭귄객체 instanceof 동물);
		System.out.println(펭귄객체 instanceof 조류);
		System.out.println(펭귄객체 instanceof 펭귄);
	}
}