package java_20190528;

public class ForDemo {
	public static void main(String[] args){
		int sum = 0;
		int i=0;
		
		for(i=1;i<=100;i++){
			if(i%2==1){
				sum = sum +i;
			}
		}
		System.out.println("1���� "+(i-1)+" ���� ���� : "+sum);
		
		
		tt2:for(int j=2;j<=9;j++){
			if(j==3) continue;
				for(int k=1;k<=9;k++){
					if(k==4) break tt2;
				System.out.println(j+"*"+k+"="+(j*k));
			}
		}
		

		
		//�Ҽ� ���ϱ�
		int primeCount =0;
		int cnt =0;
		
		for(int a=2;a<=100;a++){
			int count = 0;
			for(int k=2;k<a;k++){
				cnt++;
				if(a%k==0){
					count +=1;
					break ;
				}
			}
			if(count==0){
				System.out.println(a+"�� �Ҽ� �Դϴ�.");
				primeCount += 1;
			}
		}
		System.out.println("cnt : "+cnt);
		System.out.println("�Ҽ��� ������ : "+primeCount);
	}
}










