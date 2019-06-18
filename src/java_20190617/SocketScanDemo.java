package java_20190617;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class SocketScanDemo extends Thread {
	@Override
	public void run() {
		Socket s = null;
		for (int i = 20; i < 200; i++) {
			try {
				//Socket ��ü�� �����Ǿ��ٴ� ���� host, port�� ����� �� �ֱ� ������
				//�ش� host, port�� ������̴ٴ� �����.
				s = new Socket("183.111.174.34", i);
				System.out.println(i+"��ȣ�� ����� �Դϴ�.");
			} catch (UnknownHostException e) {
				System.out.println("�ش� ȣ��Ʈ�� �߸� �Ǿ����ϴ�.");
			} catch (IOException e) {
				System.out.println(i + "��ȣ�� ������� �ʰ� �ֽ��ϴ�. ");
			}

		}
	}

	public static void main(String[] args) {
		SocketScanDemo s = new SocketScanDemo();
		s.start();
	}
}
