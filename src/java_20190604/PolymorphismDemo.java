package java_20190604;

public class PolymorphismDemo {
	public static void execute(Shape s){//�߻�Ŭ������ ����������, ������
		s.draw();
	}
	
	public static void main(String[] args) {
		Triangle t = new Triangle();
		execute(t);
		
		Ractangle r = new Ractangle();
		execute(r);
		
	}
}
