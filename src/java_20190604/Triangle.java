package java_20190604;

public class Triangle extends Shape{
	String dot;
	double angleDegree;

	@Override
	// public ����� ����. ��? �θ� public�̶� �װͺ��� �۾����� �ȵ�~
	// �������̵� �ۼ� ��Ģ
	//1. �޼ҵ� �̸� ���ƾ���.
	//2. �Ű����� ������ �ڷ����� ��ġ�ؾ���.
	//3. ��ȯ���� ���ƾ���.
	//4. ���� �����ڴ� �θ𺸴� ũ�ų� ���ƾ���
	public void draw(){

		System.out.println("Triangle - draw()");
	}
	
	public void drawCoordinate(){
		System.out.println("Triangle - drawCoordinate()");
		
	}
	
}
