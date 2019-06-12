package java_20190610;

//쓰레드를 작동하기 위해서는 무조건 쓰레드를 상속받아야 한다.
//쓰레드클래스는 runnable 인터페이스를 implements된 클래스
//결국 쓰레드는 두가지 방법 모두 runnable객체여야 한다는 것!
public class ThreadDemo extends Thread{
	
 public ThreadDemo(String msg){
	 //Tread클래스의 매개변수가 문자열인 생성자를 호출.
	 //msg는 스레드이름을 정한다.
	 super(msg);
 }
 
 public void run(){
	 for(int i=0;i<1000;i++){
		 String threadName = Thread.currentThread().getName();
		 System.out.println(threadName + " : "+i);
	 }
 }
 
 public static void main(String[] args) {
	//이미 start/end는 수행 완료, ThreadDemo t1,t2는 왔다갔다 계속 재생.
	System.out.println("*****************start*****************");
	ThreadDemo t1 = new ThreadDemo("첫번째 스레드");
	t1.start();
	ThreadDemo t2 = new ThreadDemo("두번째 스레드");
	t2.start();
	System.out.println("*****************end*******************");
}
 
}
