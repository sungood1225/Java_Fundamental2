package java_20190605;

public class WrapperDemo {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		String s1 = "42.5";
		String s2 = "90.5";
		
		//primitive date type을 Wrapper클래스로 변환  int ==> Integer
		//박싱의 방법을 주석으로 달음
		Integer a1 = new Integer(a); // => Integer a1 = a;
		Integer a2 = new Integer(b); // => Integer a2 = b;
		
		//컴플라이언스 1.4레벨에서는 클래스간 합이 당연히 안됨
		//더하려면 wrapper class => primitive data type으로 변환
		//int a3 = a1 + a2;
		int a3 = a1.intValue() + a2.intValue(); //언박싱되면 int a3 = a1 + a2;
		
		//String => primitiv date type 변환
		double d1 = Double.parseDouble(s1);
		double d2 = Double.parseDouble(s2);
		
		double d3 = d1 + d2;
		
		System.out.println(a3);
		System.out.println(d3);
		
		//(auto)boxing : primitive data type => Wrapper class 자동 변환
		Integer a4 = 10;
		Integer a5 = 20;
		
		//(auto)unboxing : Wrapper class => primitive data type 자동변환
		
		int a6 = a4 + a5;
		

	}
}
