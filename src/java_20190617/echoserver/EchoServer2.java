package java_20190617.echoserver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer2 {
	private int port;
	private ServerSocket serverSocket;
	
	public EchoServer2(int port){
		this.port = port;
		try {
			//1. 서버소켓 객체를 생성한다.
			serverSocket = new ServerSocket(port);
			//2. accept 메소드를 이용하여  클라이언트 접속을 대기한다.
			System.out.println("클라이언트 접속을 기다리고 있습니다."); //accep보다 미리 써야하는 이유.
			//accept 메소드는 소켓이라는 반환값(클라이언트가 접속해야 가능)이 나올때까지 작동하니 클라이언트 접속과 동시에 실행됨.
			Socket socket = serverSocket.accept();

			InetAddress ia = socket.getInetAddress();
			String ip = ia.getHostAddress();
			System.out.println(ip+"가 접속하셨습니다.");
			
			
			
			InputStream in = socket.getInputStream();
			InputStreamReader isr = new InputStreamReader(in);
			BufferedReader br = new BufferedReader(isr);
			String readLine = br.readLine();
			System.out.println(readLine);
			
			OutputStream out = socket.getOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(out);
			BufferedWriter bw = new BufferedWriter(osw);
			bw.write(readLine);
			bw.newLine();
			bw.flush();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
	
	public static void main(String[] args) {
		new EchoServer2(3002);
	}
}
