package java_20190605;

public class WrapperDemo {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		String s1 = "42.5";
		String s2 = "90.5";
		
		//primitive date type�� WrapperŬ������ ��ȯ  int ==> Integer
		//�ڽ��� ����� �ּ����� ����
		Integer a1 = new Integer(a); // => Integer a1 = a;
		Integer a2 = new Integer(b); // => Integer a2 = b;
		
		//���ö��̾� 1.4���������� Ŭ������ ���� �翬�� �ȵ�
		//���Ϸ��� wrapper class => primitive data type���� ��ȯ
		//int a3 = a1 + a2;
		int a3 = a1.intValue() + a2.intValue(); //��ڽ̵Ǹ� int a3 = a1 + a2;
		
		//String => primitiv date type ��ȯ
		double d1 = Double.parseDouble(s1);
		double d2 = Double.parseDouble(s2);
		
		double d3 = d1 + d2;
		
		System.out.println(a3);
		System.out.println(d3);
		
		//(auto)boxing : primitive data type => Wrapper class �ڵ� ��ȯ
		Integer a4 = 10;
		Integer a5 = 20;
		
		//(auto)unboxing : Wrapper class => primitive data type �ڵ���ȯ
		
		int a6 = a4 + a5;
		

	}
}
