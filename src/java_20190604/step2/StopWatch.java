package java_20190604.step2;

public class StopWatch {
	public long startTime;
	public long endTime;
	public void start(){
		startTime = System.currentTimeMillis();
	}
	
	public void stop(){
		endTime = System.currentTimeMillis();
	}
	public double getElapsedTime(){
		return (double)(endTime-startTime)/(double)1000;
	}
	
	
	public long startNanoTime;
	public long endNanoTime;
	
	public void startNano(){
		startNanoTime = System.nanoTime();
	}
	
	public void stopNano(){
		endNanoTime = System.nanoTime();
	}
	

	
	public double getElapsedNanoTime(){
		return (double)(endNanoTime-startNanoTime)/(double)1000000000;
	}

}
