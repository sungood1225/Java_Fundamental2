package java_20190620_21;
import java.awt.Color;
import java.awt.Graphics;

public class RedDuck extends Duck implements Flyable, Quackable {
	
	public void display(Graphics g) {
		g.setColor(Color.RED);
		g.fillOval(x, y, Duck.SIZE, Duck.SIZE);
		// TODO Auto-generated method stub
		}

	@Override
	public void quack(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.RED);
		String sound = "²Ð²Ð";
		g.drawString(sound, x+20, y);
	}

	@Override
	public void fly(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.RED);
		g.drawString("³¯´Ù", x-20, y+Duck.SIZE+2);
	}

	public void swim(Graphics g){
		g.setColor(Color.RED);
		g.drawString("¼ö¿µ", x-20, y);
	}

};
