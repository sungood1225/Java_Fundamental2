package java_20190620_21;
import java.awt.Color;
import java.awt.Graphics;

public class MallarDuck extends Duck implements Flyable, Quackable {
	
	public void display(Graphics g) {
		g.setColor(Color.BLUE);
		g.fillOval(x, y, Duck.SIZE, Duck.SIZE);
		// TODO Auto-generated method stub
		}
	
	@Override
	public void fly(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.BLUE);
		g.drawString("����", x-20, y+Duck.SIZE+2);
	}

	@Override
	public void quack(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.BLUE);
		String sound = "�в�";
		g.drawString(sound, x+20, y);
	}

	public void swim(Graphics g){
		g.setColor(Color.BLUE);
		g.drawString("����", x-20, y);
	}


};
