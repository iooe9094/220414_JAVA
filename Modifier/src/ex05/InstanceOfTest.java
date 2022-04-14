package ex05;

public class InstanceOfTest {
	
	public static void testAllPhone(Phone p) {
		
		if(p instanceof IPhone) {
			((IPhone)p).sms(); // Phone p에 IPhone이 온다 -> ((IPhone)p) / sms() 호출
		} else if (p instanceof Galaxy) {
			((Galaxy)p).dmb(); // Phone p에 Galaxy가 온다면 dmb() 호출
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IPhone p1 = new IPhone();
		Galaxy p2 = new Galaxy();
		
		testAllPhone(p1);
		testAllPhone(p2);
	}
}
