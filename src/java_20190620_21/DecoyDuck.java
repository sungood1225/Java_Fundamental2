package java_20190620_21;
import java.awt.Color;
import java.awt.Graphics;

public class DecoyDuck extends Duck {
	
	public void display(Graphics g) {
		g.setColor(Color.GREEN);
		g.fillOval(x, y, Duck.SIZE, Duck.SIZE);
		// TODO Auto-generated method stub
		}
	public void swim(Graphics g){
		g.setColor(Color.GREEN);
		g.drawString("¼ö¿µ", x-20, y);
	}

};
