package java_20190603;

public class ExtendsDemo {
	public static void main(String[] args) {
		Customer c = new Customer();
		c.name = "신지은";
		c.cphone = "010-9191-0290";
		System.out.println("이름 : "+c.name);
		System.out.println("핸드폰 : "+c.cphone);
		c.actionCustomer();
		
		
		Alba a = new Alba();
		a.name = "알바생";
		a.cphone = "010-0000-0000";
		a.address = "서울";
		System.out.println("이름 : "+a.name);
		System.out.println("핸드폰 : "+a.cphone);
		System.out.println("주소 : "+a.address);
		a.actionAlba();
		a.actionCustomer();
	
		
		Manager m = new Manager();
		m.name = "매니저";
		m.cphone = "010-1111-1111";
		m.address = "경기도";
		m.id = "sungood1225";
		m.password = "123123";
		System.out.println("이름 : "+m.name);
		System.out.println("핸드폰 : "+m.cphone);
		System.out.println("주소 : "+m.address);
		System.out.println("ID : "+m.id);
		System.out.println("암호: "+m.password);
		m.actionCustomer();
		m.actionAlba();
		m.actionManager();
		
		//Super 타입(Alba)으로 Sub객체(Manger)를 생성할 수 있다.
		//부모타입으로부터 자식타입이 생성퇼 수 있다.
		//멤버변수는 Super(Alba)의 타입을 포함한 상위 클래스(Customer) 접근 가능
		Alba alba = (Alba)new Manager();
		alba.name = "매니저";
		alba.cphone = "010-1111-1111";
		alba.address = "경기도";
		//alba.id = "sungood1225";
		//alba.password = "123123";
		System.out.println("이름 : "+alba.name);
		System.out.println("핸드폰 : "+alba.cphone);
		System.out.println("주소 : "+alba.address);
		alba.actionAlba();
		alba.actionCustomer();
		

	}
}
