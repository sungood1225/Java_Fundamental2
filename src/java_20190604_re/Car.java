package java_20190604_re;

public class Car {
	String modelNumber;
	String color;
	int year;
	
	public void whatIsColor(){
		System.out.println("������ ������"+color+"�Դϴ�.");
	}
	
	public String getColor (){
		return "�� ���� ������" + color + "��!!!!";
	}
	
	public static void main(String[] args) {
		Car c1 = new Car();
		//�÷��������̶� null
		c1.whatIsColor();
		c1.modelNumber = "0101010";
		c1.color = "white";
		c1.year = 2018;
		//�÷������Ķ� white.
		c1.whatIsColor();
		//getColor �޽���� ��ȯ���� String�̴ϱ� StringŸ������ �޾������.
		String msg = c1.getColor();
		System.out.println(msg);
		
		Car c2 = new Car();
		c2.whatIsColor();
		c2.modelNumber = "0111111";
		c2.color = "black";
		c2.year = 2019;
		c2.whatIsColor();
		String abc = c2.getColor();
		System.out.println(abc);
		
		Car c3 = new Car();
	;
		c3.modelNumber = "0121212";
		c3.color = "red";
		c3.year = 2017;
		
		
		System.out.println("ù��° ��ü ����ϱ�");
		System.out.println(c1.modelNumber + "\t" + c1.color + "\t" + c1.year);
		
		System.out.println("�ι�° ��ü ����ϱ�");
		System.out.println(c2.modelNumber + "\t" + c2.color + "\t" + c2.year);		

		System.out.println("����° ��ü ����ϱ�");
		System.out.println(c3.modelNumber + "\t" + c3.color + "\t" + c3.year);
	}
}
