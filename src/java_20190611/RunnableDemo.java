package java_20190611;

public class RunnableDemo implements Runnable {
	//run�� runnable��ü�� �޼ҵ�. �������̵� �ʼ�.
	
	
	@Override
	public void run() {
		 for(int i=0;i<1000;i++){
			 String threadName = Thread.currentThread().getName();
			 System.out.println(threadName + " : "+i);}
	}
	public static void main(String[] args) {
		System.out.println("*****************start*****************");
		RunnableDemo r1 = new RunnableDemo();
		Thread t1 = new Thread(r1,"ù��° ������");
		System.out.println("ù��° ������ �켱���� : "+t1.getPriority());
	

		
		RunnableDemo r2 = new RunnableDemo();
		//���������̸��� ������ ���� �����ڳ� �޼��带 ���� ���� �Ǵ� ���� ����
		//Thread(Runnable target, String name) Thread(String name)
		//Thread�� runnable target�� ���� �����Ѱ��� �߿� ����Ʈ
		//����� �������̽��� ������ ������ �Ұ����ϴ�.
		Thread t2 = new Thread(r2,"�ι�° ������");
		System.out.println("�ι��� ������ �켱���� : "+t2.getPriority());
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
