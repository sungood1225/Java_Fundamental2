package java_20190620_21;

import java.awt.Frame;
import java.awt.Graphics;
import java.util.HashSet;
import java.util.Random;

public class MyFrame2 extends Frame {

	public static final int FRAME_WIDTH = 800;
	public static final int FRAME_HEIGHT = 600;



	public MyFrame2() {
		// super();//new Frame() ������ �����Ϸ��� �ڵ����� �����ؼ� �ּ�ó����.
		this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		this.setVisible(true);// ���������κ��� ������� ����.
	}

	public void paint(Graphics g) {
		
		DuckManager mgr = new DuckManager();
		mgr.displayAllDucks(g);
		mgr.swimAllDucks(g);
		mgr.quackAllDucks(g);
		mgr.flyAllDucks(g);
		
	}


};
