package java_20190604.step3;

public class StopMilliWatch {
	// Ŭ������ �и��Ǹ鼭 ������� �޼ҵ���� ���ϵǾ���.
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
