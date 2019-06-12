package java_20190605;

public class MathDemo {
	public static void main(String[] args) {
		double d1 = Math.ceil(4.5);
		System.out.println(d1);
		double n = (int) Math.ceil(4.5);
		System.out.println(n);
		
		double d2 = Math.floor(4.5);
		System.out.println(d2);
		
		//아래는 오류가 남. 왜? double값은 long이 반환값이기 때문
		//int d3 = Math.round(42.5)
		int d3 = Math.round(42.555f);
		System.out.println(d3);
		
		long d4 = Math.round(42.566);
		System.out.println(d4);
		
		double d5 = Math.abs(-4234.56);
		System.out.println(d5);
		
		double d6 = Math.max(4.5,6.7);
		System.out.println(d6);
		
		double d7 = Math.min(34.67, 56.24);
		System.out.println(d7);
		
		double d88 = Math.sqrt(4);
		System.out.println(d88);

		double d8 = Math.pow(2,3);
		System.out.println(d8);
		
		double d9 = Math.random();
		System.out.println(d9);
	
	}
}
