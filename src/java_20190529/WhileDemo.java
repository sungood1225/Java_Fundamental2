package java_20190529;

public class WhileDemo {
	public static void main(String[] args){
		int sum = 0;
		int i=0;
		while(i<=100){
			sum += i;
			i++;
		}
		System.out.println("1~100 гу :"+sum);

			
		int j=2;
		while(j<=9){
			int k=1;
			while(k<=9){
				System.out.println(j+"*"+k+"="+(j*k));
				k++;
			}
			j++;
		}
	}
}
