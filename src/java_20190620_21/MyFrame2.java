package java_20190620_21;

import java.awt.Frame;
import java.awt.Graphics;
import java.util.HashSet;
import java.util.Random;

public class MyFrame2 extends Frame {

	public static final int FRAME_WIDTH = 800;
	public static final int FRAME_HEIGHT = 600;



	public MyFrame2() {
		// super();//new Frame() 어차피 컴파일러가 자동으로 수행해서 주석처리함.
		this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		this.setVisible(true);// 윈도우으로부터 제어권을 얻어옴.
	}

	public void paint(Graphics g) {
		
		DuckManager mgr = new DuckManager();
		mgr.displayAllDucks(g);
		mgr.swimAllDucks(g);
		mgr.quackAllDucks(g);
		mgr.flyAllDucks(g);
		
	}


};
