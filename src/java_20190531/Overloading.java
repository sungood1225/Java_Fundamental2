package java_20190531;
//�����ε��̶� Ŭ�����ȿ��� �޽�� �̸��� ���Ƶ� ��� ����.
//�����ε� ���ϸ� ������.
//������ ���� �޽�带 ���� �ʿ䰡 �������� ����. �������ַ� �����! print�� ���뵿���̴�~
public class Overloading {
	public void print(int i){
		System.out.println(i);
	}
	
	public void print(String s){
		System.out.println(s);
	}
	
	public void print(double d){
		System.out.println(d);
	}
	//printInt��� �̸��� ���� ���� �̸�...~~
	public void printInt(int i){
		System.out.println(i);
	}

}
