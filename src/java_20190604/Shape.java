package java_20190604;

//�߻�Ŭ����! abstract�� �ٿ��ش�
public abstract class Shape {
	String name;
	double degree;
	//�߻�޼ҵ�! �ڽĵ��� �� �Ʒ� �޼ҵ带 �������̵� �ؾ���.
	public abstract void draw();
	
	public void drawLine(){
		System.out.println("Shape - drawLine()");
	}
}
