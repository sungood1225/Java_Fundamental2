package java_20190531;

public class Constructor {
	//인스탄스 변수들, 객체생성할 때 원래 null 이런식으로 나오는데 이름을 넣어주고 싶다면
	//생성자를 만들어준다.
	private String name;
	private String email;
	private int age;
	
	//디폴트 생성자, 매개값이 없다. : 클래스 내에 생성자가 없는 경우 compiler가 자동으로 생성해준다.
	//클래스 내에 생성자가 1개라도 있는 경우는 compiler 생성해주지 않는다.
	//생성자는 클래스 이름과 같고, 반환값이 없는 형태를 가지고 있다.
	//아무것도 없으면 굳이 안써도 자동으로 만들어지나, 생성자는 오버로딩될 수 있으니 이때 따로 안만들면 에러가 날 수 있다.
	//그래서 시작할 때 미리 만들어놓으면 오류를 줄일 수 있다.
	// 이 아이는 아무 값도 없어서 생성자의 초기화 기능을 수행할 수 없음.
	public Constructor(){

	}
	
	public Constructor(String name, String email){
		// 매개변수 3개짜리 생성자 호출
		this(name,email,0);
		//this.name = name;
		//this.email = email;
		
	}
	
	//매개 변수 3개인 생성자
	//메소드의 overloading처럼 생성자도 overloading이 가능함
	public Constructor(String name, String email, int age) {
		//this는 로컬변수와 instance변수를 구분하기 위해 사용함
		this.name = name;
		this.email = email;
		this.age = age;
	
		/* 아래의 같은 방법도 있으나 허접하다고 안함...
	 public Constructor(String n, String e, int a) {
		name = n;
		email = e;
		age = a;}	**/
	}
	
	//예전에는 c.name = 신지은 등 3줄로 따로따로 했는데 생성자를 통해  1줄의 매개변수로 변경 가능.
	public static void main(String[] args) {
		Constructor c = new Constructor("신지은","sungood1225@gmail.com", 20);
		System.out.println(c.name);
		System.out.println(c.email);
		System.out.println(c.age);
		
	}
}
