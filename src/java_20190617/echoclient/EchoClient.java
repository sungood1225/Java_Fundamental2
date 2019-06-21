package java_20190617.echoclient;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class EchoClient {
	private String ip;
	private int port;
	private Socket socket;
	
	public EchoClient(String ip, int port){
		this.ip = ip;
		this.port = port;
		
		try {
			//3. Socket ��ü�� �����Ѵ�.4. ������ Ŭ���̾�Ʈ�� tcp connection
			socket = new Socket(ip,port);
			//7. ������ ����� �� �ִ� Socket ��ü ����
			
			//8. ������ ����� �� �ִ� out,in ��Ʈ�� ���� (Ŭ���̾�Ʈ�� ���� ���Ŵ� out��Ʈ���� ����)
			OutputStream out = socket.getOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(out);
			BufferedWriter bw = new BufferedWriter(osw);
			bw.write("�̤�");
			bw.newLine();
			bw.flush();
			
			InputStream in = socket.getInputStream();
			InputStreamReader isr = new InputStreamReader(in);
			BufferedReader br = new BufferedReader(isr);
			String readLine = br.readLine();
			System.out.println(readLine);

		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		new EchoClient("192.168.0.159",3000);
		
	}
}
