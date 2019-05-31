package java_20190531;

import java_20190531.tt.Cat;

//extends Cat의 의미는  해당 class의 엄마를 Cat으로 한다.상속의 개념
//protected는 따라온다. 그러나 private, default는 따라오지 못한다.
public class AccessModifierDemo extends Cat{
	public static void main(String[] args) {
		Car c = new Car();
		
		// c.modelnumber 경고가 뜨는 이유. car 클래스에서 프라이빗한 변수이기 때문.
		// 접근하고 싶으면 public으로 바꾸거나 세터게터를 만들어줘야함.
		//c.modelNumber = "68오4472"
		
		//default는 같은 패키지(디렉토리)에서 접근 가능
		c.color = "red";
		
		//protected는 서로 다른 패키지에서 상속받은 경우 접근 가능
		c.doorCount = 5;

		//public은 서로 다른 패키지에서 접근 가능
		c.price = 10_000_000;
		
		System.out.println(c.color);
		System.out.println(c.doorCount);
		System.out.println(c.price);
		
		//처음에 cat 인식 못하는 이유. 다른 패키지 (tt) 내에 있어서. 위에서 import하는 작업이 필요.
		//ctrl+shift+O 가 단축기, 또는 Cat 뒤에 커서를 놓고 컨트롤 스페이스 누르면 알아서 찾아줌
		Cat cat = new Cat();
		//nickName만 불러올 수 있음. 디폴트 프로텍티드 둘 다 서로 다른 패키지라 인식을 못함
		cat.nickName = "tomcat";
		
		//위에서 cat클래스의 상속을 받았기 때문에, protected 정보인 age가 인식 가능하다.
		AccessModifierDemo a = new AccessModifierDemo();
		a.age = 10;
		a.nickName = "먼지";
		
				
				
	}
}
