package java_20190620_21;
import java.awt.Graphics;
import java.util.Random;

public abstract class Duck {
	protected int x;
	protected int y;
	
	public static final int SIZE=30;
	
	public Duck(){
		Random rnd = new Random();
		//0~800 사이의 값을 뽑아주면 됨. nextInt()메소드는 매개변수 미만 0이상 정수를 추출해짐. 근데 어떠한 창은 여백이 이미 포함되어있음, 50~750으로 잡아야하는 이유.
		//사실 위치정보는 프레임의 역할. 객체를 생성하지 않고 바로 불러오려면 static으로  변수선언하고 클래스 이름으로 불러오면 된다.
		x = rnd.nextInt(MyFrame2.FRAME_WIDTH-100)+50; //50~750
		y = rnd.nextInt(MyFrame2.FRAME_HEIGHT-140)+70; //70~530
	}
	
	public Duck(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public void swim(Graphics g){
		g.drawString("수영", x-20, y);
	}
	
/*	public void quack(Graphics g){
		String sound = "꽥꽥";
		g.drawString(sound, x+2, y+Duck.SIZE);
	}*/
	
	public abstract void display(Graphics g);
	

}
