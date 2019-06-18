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

public class EchoServer {
	private int port;
	private ServerSocket serverSocket;
	public EchoServer(int port){
		this.port = port;
		try {
			//1. ServerSocket�� �����Ѵ�.
			serverSocket = new ServerSocket(port);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		while(true){
			System.out.println("Ŭ���̾�Ʈ ������ ����ϰ� �ֽ��ϴ�.");
			try {
				//accpet()�޼���� ���ŷ�޼���
				//Ŭ���̾�Ʈ�� �����ϱ� �������� ������� �ʴ� ���ŷ �޼���
				//2. Ŭ���̾�Ʈ ������ ����Ѵ�.
				Socket socket = serverSocket.accept();
				//5.7 Ŭ���̾�Ʈ�� ����� �� �ִ� Socket�� ����
				InetAddress ia = socket.getInetAddress();
				String ip = ia.getHostAddress();
				System.out.println("Ŭ���̾�Ʈ�� �����Ͽ����ϴ�. IP :"+ ip);
				//9. Ŭ���̾�Ʈ�� ����� �� �ִ� in,out ��Ʈ�� ���� (Ŭ���̾�Ʈ���� ������
				//io�� �ݴ� ������ ��������.

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
	}

	public static void main(String[] args) {
		new EchoServer(3000);
		
	}
}
