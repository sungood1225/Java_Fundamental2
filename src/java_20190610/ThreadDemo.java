package java_20190610;

//�����带 �۵��ϱ� ���ؼ��� ������ �����带 ��ӹ޾ƾ� �Ѵ�.
//������Ŭ������ runnable �������̽��� implements�� Ŭ����
//�ᱹ ������� �ΰ��� ��� ��� runnable��ü���� �Ѵٴ� ��!
public class ThreadDemo extends Thread{
	
 public ThreadDemo(String msg){
	 //TreadŬ������ �Ű������� ���ڿ��� �����ڸ� ȣ��.
	 //msg�� �������̸��� ���Ѵ�.
	 super(msg);
 }
 
 public void run(){
	 for(int i=0;i<1000;i++){
		 String threadName = Thread.currentThread().getName();
		 System.out.println(threadName + " : "+i);
	 }
 }
 
 public static void main(String[] args) {
	//�̹� start/end�� ���� �Ϸ�, ThreadDemo t1,t2�� �Դٰ��� ��� ���.
	System.out.println("*****************start*****************");
	ThreadDemo t1 = new ThreadDemo("ù��° ������");
	t1.start();
	ThreadDemo t2 = new ThreadDemo("�ι�° ������");
	t2.start();
	System.out.println("*****************end*******************");
}
 
}
