package java_20190604_re;

import org.omg.Messaging.SyncScopeHelper;

public class Car2 {
	String modelNumber;
	String color;
	int year;
//�޼ҵ���� Ŭ���� �̸��� �����ϸ鼭 ��ȯ���� ������ �����ڴ�!!
//�ν�ź�� ���� �ʱ�ȭ�� �� ���� ���� ������
	public Car2(String modelNumber, String color, int year){
		//�Ű������� �ν�ź�������� �����ϱ� ������ �������� ����  this�� ���.
		this.modelNumber = modelNumber;
		this.color = color;
		this.year = year;
		}
	
	public static void main(String[] args) {
	Car2 c1 = new Car2("01000000", "white", 2018);
	System.out.println("ù��° ��ü ����ϱ�");
	System.out.println(c1.modelNumber + "\t" + c1.color + "\t" + c1.year);
	
	Car2 c2 = new Car2("01010101", "black", 2019);
	System.out.println("�ι�° ��ü ����ϱ�");
	System.out.println(c2.modelNumber + "\t" + c2.color + "\t" + c2.year);		

	Car2 c3 = new Car2("11112333", "red", 2017);
	System.out.println("����° ��ü ����ϱ�");
	System.out.println(c3.modelNumber + "\t" + c3.color + "\t" + c3.year);

	
	}
	
	
}
