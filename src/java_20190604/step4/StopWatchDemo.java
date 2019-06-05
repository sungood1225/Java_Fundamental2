package java_20190604.step4;

public class StopWatchDemo {
	public static void execute(StopMilliWatch sm){
		sm.start();
		
		for(int i=0;i<2_000_000_000L;i++){
			
		}
		
		sm.stop();
		System.out.println("����ð�(�и�������) :"+sm.getElapsedTime());
	}
	
	public static void execute(StopNanoWatch sn){
		sn.start();
		
		for(int i=0;i<2_000_000_000L;i++){
			
		}
		
		sn.stop();
		System.out.println("����ð�(���뼼����) :"+sn.getElapsedTime());
	}
	
	public static void main(String[] args) {
		StopMilliWatch sm = new StopMilliWatch();
		execute(sm);
		
		StopNanoWatch sn = new StopNanoWatch();
		execute(sn);
		
	
	
	}	
}
