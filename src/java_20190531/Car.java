package java_20190531;

public class Car {
	//private 쓰니 경고 창이 켜짐, 세터게터 만들라는 이야기.
	private String modelNumber; 
	String color;
	protected int doorCount;
	public double price;
	// 가격은 double로 잡는 것이 좋다. 소수점이하가 나올 가능성이 크기 때문.
	
	//alt+shift+s => c (디폴트생성자 단축기)
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//alt+shift+s => o (매개변수생성자 단축기)
	public Car(String modelNumber, String color, int doorCount, double price) {
		super();
		this.modelNumber = modelNumber;
		this.color = color;
		this.doorCount = doorCount;
		this.price = price;
	}
	
	

	
	
}
