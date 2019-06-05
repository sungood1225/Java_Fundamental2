package java_20190604;

public class OverridingDemo {
	// 자식것이 호출된다.
	public static void main(String[] args) {
		//객체생성이 안됨. 왜? 추상클래스이기 때문. Shape클래스에서 abstract 빼면 다시 생성 가능.
		//Shape shape = new Shape();
		
		
		Triangle t = new Triangle();
		t.draw();
		
		Ractangle r = new Ractangle();
		r.draw();
		
		//추상클래스 객체생성의 좋은 예
		Shape s = new Triangle();
		s.name = "삼각형";
		s.degree = 60;
		s.drawLine();
		s.draw(); // Shape의 draw()가 호출되지 않고 Triangle의 draw()호출됨
		//s.dot = "";
		//s.angleDegree = 180;
		//s.drawCoordinate();
		
	}

}
