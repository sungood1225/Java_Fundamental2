package java_20190604.step3;

public class StopWatchDemo {
	public static void main(String[] args) {
		StopMilliWatch sm = new StopMilliWatch();
		sm.start();
		
		for(int i=0;i<2_000_000_000L;i++){
			
		}
		
		sm.stop();
		System.out.println("����ð�(�и�������) :"+sm.getElapsedTime());
		
		StopNanoWatch sn = new StopNanoWatch();
		
		sn.start();
		
		for(int i=0;i<2_000_000_000L;i++){
			
		}
		
		sn.stop();
		System.out.println("����ð�(���뼼����) :"+sn.getElapsedTime());
	
	
	}	
}
