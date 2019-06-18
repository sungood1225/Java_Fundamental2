package java_20190617;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSocketScanDemo extends Thread {
	
	@Override
	public void run() {
		ServerSocket s = null;
		for (int i = 0; i < 65535; i++) {
			//ServerSocket Ŭ������ �ش� ������ port��ȣ�� ����� �� ������
			//ServerSocket ��ü�� ������ �� �ְ�, ���ܸ� �߻��ϴ� ����
			//�ش� port�� ����ϴ� ����̴�.
			try {
				s = new ServerSocket(i);
				//accept�� ���ѷ����� ����鼭 ��� ������� ������ �� �ֵ��� �ؾ� ��.
				//�ٸ� ������� �ؾ� ��.
				// �׷��� �ٸ� Ŭ���̾�Ʈ�� ���˱��� ó���� �� ����.
				Socket socket = s.accept();
				
				
			} catch (IOException e) {
				System.out.println(i + "��ȣ�� ����� �� �����ϴ�. ");
			}

		}
	}
	public static void main(String[] args) {
		ServerSocketScanDemo s = new ServerSocketScanDemo();
		s.start();
	}
}
