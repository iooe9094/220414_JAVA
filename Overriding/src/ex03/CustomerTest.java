package ex03;

public class CustomerTest {
		public static void main(String[] args) {
			// VIP, Gold, Silver, Normal
			// 속성 - 고객ID, 고객이름, 고객등급
			// 기능 - show(): 최초에 가입한 당신은 동성쇼핑몰 고객입니다.
			// VIP, Gold, Silver : ID, 이름, 등급 출력
			// ID : 1, 2, 3
			// name: "hong", "lee", "ha"
			// rank: VIP, gold, silver, normal
			
			// 위의 고객들을 생성하고 기능을 출력하세요.
			
			VIP vip = new VIP();
			vip.show();
			
			Gold gold = new Gold();
			gold.show();
			
			Silver silver = new Silver();
			silver.show();
			
			Normal normal = new Normal();
			normal.show();
   }
}
