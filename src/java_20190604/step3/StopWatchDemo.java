package java_20190604.step3;

public class StopWatchDemo {
	public static void main(String[] args) {
		StopMilliWatch sm = new StopMilliWatch();
		sm.start();
		
		for(int i=0;i<2_000_000_000L;i++){
			
		}
		
		sm.stop();
		System.out.println("경과시간(밀리세컨드) :"+sm.getElapsedTime());
		
		StopNanoWatch sn = new StopNanoWatch();
		
		sn.start();
		
		for(int i=0;i<2_000_000_000L;i++){
			
		}
		
		sn.stop();
		System.out.println("경과시간(나노세컨드) :"+sn.getElapsedTime());
	
	
	}	
}
