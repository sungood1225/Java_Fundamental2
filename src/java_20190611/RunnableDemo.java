package java_20190611;

public class RunnableDemo implements Runnable {
	//run은 runnable객체의 메소드. 오버라이딩 필수.
	
	
	@Override
	public void run() {
		 for(int i=0;i<1000;i++){
			 String threadName = Thread.currentThread().getName();
			 System.out.println(threadName + " : "+i);}
	}
	public static void main(String[] args) {
		System.out.println("*****************start*****************");
		RunnableDemo r1 = new RunnableDemo();
		Thread t1 = new Thread(r1,"첫번째 쓰레드");
		System.out.println("첫번째 스레드 우선순위 : "+t1.getPriority());
	

		
		RunnableDemo r2 = new RunnableDemo();
		//쓰레드의이름은 다음과 같은 생성자나 메서드를 통해 지정 또는 변경 가능
		//Thread(Runnable target, String name) Thread(String name)
		//Thread는 runnable target만 시행 가능한것이 중요 포인트
		//참고로 인터페이스는 생성자 생성이 불가능하다.
		Thread t2 = new Thread(r2,"두번째 쓰레드");
		System.out.println("두번쨰 스레드 우선순위 : "+t2.getPriority());
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t1.start();
		t2.start();
		System.out.println("*****************end*******************");
	}
}
