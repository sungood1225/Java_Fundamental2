package java_20190604;

public class OverridingDemo {
	// �ڽİ��� ȣ��ȴ�.
	public static void main(String[] args) {
		//��ü������ �ȵ�. ��? �߻�Ŭ�����̱� ����. ShapeŬ�������� abstract ���� �ٽ� ���� ����.
		//Shape shape = new Shape();
		
		
		Triangle t = new Triangle();
		t.draw();
		
		Ractangle r = new Ractangle();
		r.draw();
		
		//�߻�Ŭ���� ��ü������ ���� ��
		Shape s = new Triangle();
		s.name = "�ﰢ��";
		s.degree = 60;
		s.drawLine();
		s.draw(); // Shape�� draw()�� ȣ����� �ʰ� Triangle�� draw()ȣ���
		//s.dot = "";
		//s.angleDegree = 180;
		//s.drawCoordinate();
		
	}

}
