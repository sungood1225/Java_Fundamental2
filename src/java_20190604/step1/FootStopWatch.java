package java_20190604.step1;
//1. �䱸������ �и� ������� ��� �ð��� ������ּ���.
public class FootStopWatch {
	public long startTime;
	public long endTime;
	
	public double getElapsedTime(){
		return (double)(endTime-startTime)/(double)1000;
	}
	
	public static void main(String[] args) {
		FootStopWatch f = new FootStopWatch();
		//Ŀ��ƮŸ�ӹи��� �Լ��� �ǹ� : 1970�� 1��1�Ϻ��� ���ݱ����� �ð��� ��ȯ���ִ� �Լ�
		//���ؽð��� �Ȱ����� startTime-endTime�� ���� �ð����� ����
		f.startTime = System.currentTimeMillis();
		for(int i=0;i<2_000_000_000L;i++){
			
		}
		
		f.endTime = System.currentTimeMillis();
		double elapsedTime = f.getElapsedTime();
		
		System.out.println("����� �ð�(�и�������) :" +elapsedTime);
	}
}
