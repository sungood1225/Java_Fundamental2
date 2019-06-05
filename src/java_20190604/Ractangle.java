package java_20190604;

public class Ractangle extends Shape {
	// 만약에 부모의 기능을 쓰면서 또 기능을 추가하고 싶다면? super.draw();로 호출한다.
	public void draw() {
		//추상클래스가 되면서 호출할 엄마 메소드가 없어졌당.
		//super.draw();
		System.out.println("Ractangle - draw()");
	}
}
