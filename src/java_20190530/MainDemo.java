package java_20190530;

public class MainDemo {
	public static void main(String[] args) {
/*		// 1. Customer c 에서 Customer는 Reference Type. c는 reference
		// 2. new Customer()는 Object
		Customer c = new Customer();
		// 만약 name과 cphone 을 신지은과 번호를 지정 안하면, null로 나온다. 
		// customer class string은 참조변수여서 기본값이 null이기 때문.
		c.name = "신지은";
		c.cphone = "010-9191-0290";
		Customer.interestRate = 4.3;
		// 스태틱 변수이기 때문에 c에만 정해도 괜찮다. 다만 class에 다 적용되기 때문에 사실 c로 쓰지안고 class이름인 cutomer를 붙인다.
		//Customer.BANKNAME = "국민은행" --> 안바뀌는 이유. final로 이미 고정시켰기 때문.
		c.register();
		
		// 새로운 class를 만들음
		Customer c2 = new Customer();
		c2.name = "Steve Jobs";
		c2.cphone = "010-0000-0000";
		//4.3->4.5로 다 바뀜
		Customer.interestRate = 4.5;
		c2.register();
		
		// 기존 class에 연결함 - c3가 변하면 c2 또한 변한다. call by reference의 예
		// c3 reference를 c2 reference가 가르키니는 object를 참조하라는 의미
		Customer c3 = c2;
		c3.name = "손정의";
		c3.cphone = "010-1111-2222";
		
		c3.register();
		c2.register();
		
		 c==c2 false(new,new로 다른 객체를 만들었기 때문) , 
		 * c2==c3 true 레퍼런스타입일때는 두 레퍼런스가 같은 객체를 참조해야함. 내용물이 같더라도
		 * 다른 객체이면 같은 것이 아니다. 내용물은 전혀 상관이 없어. 
		 */
		
	Member m = new Member();
	m.setName("sung");
	m.setCphone("010-0909-9090");
	m.setAddress("seoul");
	m.setZipcode("46780");

	System.out.println(m.getName());
	System.out.println(m.getAddress());
	System.out.println(m.getCphone());
	System.out.println(m.getZipcode());
	
				
				
		
	}
}
