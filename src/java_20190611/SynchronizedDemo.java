package java_20190611;

public class SynchronizedDemo implements Runnable {
	int x;
	int y;
	@Override
	public synchronized void run() {
		// TODO Auto-generated method stub
		//ó������ run �޼ҵ忡 ������ �����ߴ�!
		//�ν�ź�������� for���ȿ��� �����ϸ� ����ġ ���� ���� ���� ���� �ִ�.
		//�̋� synchronized �� �޼ҵ带 block�ϸ� �켱 ���� �ְ� ������� �P���� �ʴ´�.
		for(int i=0;i<20;i++){
			x++;
			y++;
			String threadName = Thread.currentThread().getName();
			System.out.printf("x : %d , y : %d - %s%n",x,y,threadName);
		}
	}
	//���� ��ü�� ������ ��
	
	public static void main(String[] args) {
		SynchronizedDemo s1 = new SynchronizedDemo();
		Thread t1 = new Thread(s1);
		
		SynchronizedDemo s2 = new SynchronizedDemo();
		Thread t2 = new Thread(s2);
		
		t1.start();
		t2.start();
		
		
	}
}
