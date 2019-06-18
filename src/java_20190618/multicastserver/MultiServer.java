package java_20190618.multicastserver;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class MultiServer {

	private ServerSocket serverSocket;
	private ArrayList<MultiServerThread> list;
	private Socket socket;
	
	public MultiServer(int port) {
		
		list = new ArrayList<MultiServerThread>();
		try {
			serverSocket = new ServerSocket(port);
		} catch (IOException e) {
			System.out.println(port + "번호를 사용하고 있습니다.");
			e.printStackTrace();
			// 서버소켓이 안만들어지면 유니캐스트 서버는 의미가 없어짐. 해당 프로그램을 종료해야함.
			System.exit(0);
		}

		MultiServerThread mst = null;

		while (true) {
			System.out.println("클라이언트 접속을 대기하고 있습니다.");
			Socket socket = null;

			try {
				socket = serverSocket.accept();
				System.out.println("client ip : " + socket.getInetAddress().getHostAddress());

				// Runnable한 객체이다.
				mst = new MultiServerThread(socket,list);
				
				list.add(mst);
				
				Thread t = new Thread(mst);
				t.start();

			} catch (IOException e) {
				// TODO: handle exception
			}
		}
		

		
	}

	public static void main(String[] args) {
		new MultiServer(3003);
	}
}
