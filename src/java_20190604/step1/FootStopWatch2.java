package java_20190604.step1;
//1. 요구사항은 밀리 세컨드로 경과 시간을 만들어주세요.
public class FootStopWatch2 {
	
	public long startTime;
	public long endTime;
	
	public long startNanoTime;
	public long endNanoTime;
	
	//소수점으로 나와서 1000 곱해주는 거임
	public double getElapsedTime(){
		return (double)(endTime-startTime)/(double)1000;
	}
	
	public double getElapsedNanoTime(){
		return (double)(endNanoTime-startNanoTime)/(double)1000000000;
	}
	
	public static void main(String[] args) {
		FootStopWatch2 f = new FootStopWatch2();
		//커런트타임밀리스 함수의 의미 : 1970년 1월1일부터 지금까지의 시간을 반환해주는 함수
		//기준시간이 똑같으니 startTime-endTime을 빼면 시간차가 나옴
		f.startNanoTime = System.nanoTime();
		for(int i=0;i<2_000_000_000L;i++){
			
		}
		
		f.endNanoTime = System.nanoTime();
		double elapsedTime = f.getElapsedNanoTime();
		
		System.out.println("경과된 시간(나노세컨드) :" +elapsedTime);
	}
}
