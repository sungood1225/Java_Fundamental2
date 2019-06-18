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
			//1. �������� ��ü�� �����Ѵ�.
			serverSocket = new ServerSocket(port);
			//2. accept �޼ҵ带 �̿��Ͽ�  Ŭ���̾�Ʈ ������ ����Ѵ�.
			System.out.println("Ŭ���̾�Ʈ ������ ��ٸ��� �ֽ��ϴ�."); //accep���� �̸� ����ϴ� ����.
			//accept �޼ҵ�� �����̶�� ��ȯ��(Ŭ���̾�Ʈ�� �����ؾ� ����)�� ���ö����� �۵��ϴ� Ŭ���̾�Ʈ ���Ӱ� ���ÿ� �����.
			Socket socket = serverSocket.accept();

			InetAddress ia = socket.getInetAddress();
			String ip = ia.getHostAddress();
			System.out.println(ip+"�� �����ϼ̽��ϴ�.");
			
			
			
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
