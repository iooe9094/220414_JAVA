package ex03;

public class GoodCalc extends Calculator {

	// 파일 생성 시 Parent 넣으면 자동으로 Override 형식으로 생성됨
	// 필요한 내용에 맞게 재정의 하면 된다.
	
	@Override
	public int add(int a, int b) {
		return a + b;
	}

	@Override
	public int subtract(int a, int b) {
		return a - b;
	}

	@Override
	public int average(int[] a) {
		int addSum = 0;
		for(int i=0; i<a.length; i++) {
			addSum += a[i];
		}
		
		return ( addSum / a.length );
	}

}
