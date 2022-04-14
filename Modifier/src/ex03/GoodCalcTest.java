package ex03;

public class GoodCalcTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GoodCalc gc = new GoodCalc();
		
		int[] avg = new int[] {2, 3, 4};
		
		System.out.println("덧셈 = " + gc.add(2,3));
		System.out.println("뺄셈 = " + gc.subtract(2,3));
		System.out.println("평균 = " + gc.average(avg));
	}

}
