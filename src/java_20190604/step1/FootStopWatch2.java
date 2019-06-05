package java_20190604.step1;
//1. �䱸������ �и� ������� ��� �ð��� ������ּ���.
public class FootStopWatch2 {
	
	public long startTime;
	public long endTime;
	
	public long startNanoTime;
	public long endNanoTime;
	
	//�Ҽ������� ���ͼ� 1000 �����ִ� ����
	public double getElapsedTime(){
		return (double)(endTime-startTime)/(double)1000;
	}
	
	public double getElapsedNanoTime(){
		return (double)(endNanoTime-startNanoTime)/(double)1000000000;
	}
	
	public static void main(String[] args) {
		FootStopWatch2 f = new FootStopWatch2();
		//Ŀ��ƮŸ�ӹи��� �Լ��� �ǹ� : 1970�� 1��1�Ϻ��� ���ݱ����� �ð��� ��ȯ���ִ� �Լ�
		//���ؽð��� �Ȱ����� startTime-endTime�� ���� �ð����� ����
		f.startNanoTime = System.nanoTime();
		for(int i=0;i<2_000_000_000L;i++){
			
		}
		
		f.endNanoTime = System.nanoTime();
		double elapsedTime = f.getElapsedNanoTime();
		
		System.out.println("����� �ð�(���뼼����) :" +elapsedTime);
	}
}
