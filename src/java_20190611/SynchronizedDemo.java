package java_20190611;

public class SynchronizedDemo implements Runnable {
	int x;
	int y;
	@Override
	public synchronized void run() {
		// TODO Auto-generated method stub
		//처음으로 run 메소드에 변수를 선언했다!
		//인스탄스변수를 for문안에서 조작하면 예상치 못한 값이 나올 때가 있다.
		//이떄 synchronized 로 메소드를 block하면 우선 들어온 애가 제어권을 뻇기지 않는다.
		for(int i=0;i<20;i++){
			x++;
			y++;
			String threadName = Thread.currentThread().getName();
			System.out.printf("x : %d , y : %d - %s%n",x,y,threadName);
		}
	}
	//같은 객체를 공유할 때
	
	public static void main(String[] args) {
		SynchronizedDemo s1 = new SynchronizedDemo();
		Thread t1 = new Thread(s1);
		
		SynchronizedDemo s2 = new SynchronizedDemo();
		Thread t2 = new Thread(s2);
		
		t1.start();
		t2.start();
		
		
	}
}
