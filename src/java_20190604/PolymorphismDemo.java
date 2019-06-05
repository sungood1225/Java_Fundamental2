package java_20190604;

public class PolymorphismDemo {
	public static void execute(Shape s){//추상클래스의 폴리모피즘, 다형성
		s.draw();
	}
	
	public static void main(String[] args) {
		Triangle t = new Triangle();
		execute(t);
		
		Ractangle r = new Ractangle();
		execute(r);
		
	}
}
