package java_20190620_21;
import java.awt.Graphics;
import java.util.Random;

public abstract class Duck {
	protected int x;
	protected int y;
	
	public static final int SIZE=30;
	
	public Duck(){
		Random rnd = new Random();
		//0~800 ������ ���� �̾��ָ� ��. nextInt()�޼ҵ�� �Ű����� �̸� 0�̻� ������ ��������. �ٵ� ��� â�� ������ �̹� ���ԵǾ�����, 50~750���� ��ƾ��ϴ� ����.
		//��� ��ġ������ �������� ����. ��ü�� �������� �ʰ� �ٷ� �ҷ������� static����  ���������ϰ� Ŭ���� �̸����� �ҷ����� �ȴ�.
		x = rnd.nextInt(MyFrame2.FRAME_WIDTH-100)+50; //50~750
		y = rnd.nextInt(MyFrame2.FRAME_HEIGHT-140)+70; //70~530
	}
	
	public Duck(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public void swim(Graphics g){
		g.drawString("����", x-20, y);
	}
	
/*	public void quack(Graphics g){
		String sound = "�в�";
		g.drawString(sound, x+2, y+Duck.SIZE);
	}*/
	
	public abstract void display(Graphics g);
	

}
