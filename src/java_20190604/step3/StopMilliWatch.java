package java_20190604.step3;

public class StopMilliWatch {
	// 클래스가 분리되면서 변수명과 메소드명이 통일되어짐.
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
}
