package java_20190617;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSocketScanDemo extends Thread {
	
	@Override
	public void run() {
		ServerSocket s = null;
		for (int i = 0; i < 65535; i++) {
			//ServerSocket 클래스는 해당 서버의 port번호를 사용할 수 있으면
			//ServerSocket 객체를 생성할 수 있고, 예외를 발생하는 경우는
			//해당 port를 사용하는 경우이다.
			try {
				s = new ServerSocket(i);
				//accept는 무한루프로 만들면서 모든 사람들이 접속할 수 있도록 해야 함.
				//다만 쓰레드로 해야 함.
				// 그래야 다른 클라이언트의 접촉까지 처리할 수 있음.
				Socket socket = s.accept();
				
				
			} catch (IOException e) {
				System.out.println(i + "번호가 사용할 수 없습니다. ");
			}

		}
	}
	public static void main(String[] args) {
		ServerSocketScanDemo s = new ServerSocketScanDemo();
		s.start();
	}
}
