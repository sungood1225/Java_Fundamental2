package java_20190618.unicastserver;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class UnicastServer {

	private ServerSocket serverSocket;

	public UnicastServer(int port) {

		try {
			serverSocket = new ServerSocket(port);
		} catch (IOException e) {
			System.out.println(port + "번호를 사용하고 있습니다.");
			e.printStackTrace();
			// 서버소켓이 안만들어지면 유니캐스트 서버는 의미가 없어짐. 해당 프로그램을 종료해야함.
			System.exit(0);
		}

		UnicastServerThread ust = null;

		while (true) {
			System.out.println("클라이언트 접속을 대기하고 있습니다.");
			Socket socket = null;

			try {
				socket = serverSocket.accept();
				System.out.println("client ip : " + socket.getInetAddress().getHostAddress());

				// Runnable한 객체이다.
				ust = new UnicastServerThread(socket);
				Thread t = new Thread(ust);
				t.start();

			} catch (IOException e) {
				// TODO: handle exception
			}
		}
		

		
	}

	public static void main(String[] args) {
		new UnicastServer(3002);
	}
}
