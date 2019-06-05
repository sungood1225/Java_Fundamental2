package java_20190603;

public class CallByReferenceDemo {
	
	public static void change(int i, int[] b, String str){
		i = 20;
		b[2] = 3000;
		str = str + "def";
	}
	
	public static void main(String[] args) {
		int i = 10;
		int[] a = {10,20,30,40};
		String tt = "abc";
		System.out.println("i : " +i);
		System.out.println(a[2]);
		System.out.println(tt);
		// i°¡ call by value, a°¡ call by reference
		change(i, a, tt);
		System.out.println("i : " +i);
		System.out.println(a[2]);
		System.out.println(tt);
		
	}

}
