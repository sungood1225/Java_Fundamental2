package java_20190604.step5;

public class StopWatchDemo {
	public static void execute(StopWatch sm){//�߻�Ŭ������ ����������. �پ缺
		sm.start();
		
		for(int i=0;i<2_000_000_000L;i++){
			
		}
		
		sm.stop();
		System.out.println("����ð� :"+sm.getElapsedTime());
	}
	

	
	public static void main(String[] args) {
		StopMilliWatch sm = new StopMilliWatch();
		//�߻�Ŭ������ StopWatch�� ��ӹ��� Ŭ������ ���� �ȿ� ������ �����ϴ�
		execute(sm);
		
		StopNanoWatch sn = new StopNanoWatch();
		execute(sn);
		
	/*	StopMicroWatch smw = new StopMicroWatch();
		execute(smw);
	*/
	
	}	
}
