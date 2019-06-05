package java_20190604.step5;

public class StopWatchDemo {
	public static void execute(StopWatch sm){//추상클래스의 폴리모피즘. 다양성
		sm.start();
		
		for(int i=0;i<2_000_000_000L;i++){
			
		}
		
		sm.stop();
		System.out.println("경과시간 :"+sm.getElapsedTime());
	}
	

	
	public static void main(String[] args) {
		StopMilliWatch sm = new StopMilliWatch();
		//추상클래스인 StopWatch를 상속받은 클래스만 변수 안에 대입이 가능하다
		execute(sm);
		
		StopNanoWatch sn = new StopNanoWatch();
		execute(sn);
		
	/*	StopMicroWatch smw = new StopMicroWatch();
		execute(smw);
	*/
	
	}	
}
