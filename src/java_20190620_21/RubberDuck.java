package java_20190620_21;
import java.awt.Color;
import java.awt.Graphics;

public class RubberDuck extends Duck implements Quackable {
	
	public void display(Graphics g) {
		g.setColor(Color.ORANGE);
		g.fillOval(x, y, Duck.SIZE, Duck.SIZE);
		// TODO Auto-generated method stub
		}

	@Override
	public void quack(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.ORANGE);
		String sound = "»à»à";
		g.drawString(sound, x+20, y);
	}

	public void swim(Graphics g){
		g.setColor(Color.ORANGE);
		g.drawString("¼ö¿µ", x-20, y);
	}

};
