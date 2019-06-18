package java_20190617.echoserver;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

import javax.activation.MimetypesFileTypeMap;

public class WebServer {

	public static void main(String[] args) throws IOException {
		//html�� ������ �� �� �ִ� port�� 80��, http �̴�. 
		ServerSocket serverSocket = new ServerSocket(80);
		try {
			System.out.println("Http Server started at 80 port");
			while (true) {
				Socket socket = serverSocket.accept();
				try {
					System.out.printf("New Client Connect! Connected IP : %s, Port : %d\n", socket.getInetAddress(),
							socket.getPort());

					OutputStream out = socket.getOutputStream();
					InputStream in = socket.getInputStream();
					BufferedReader br = null;
					DataOutputStream dos = null;

					br = new BufferedReader(new InputStreamReader(in));
					dos = new DataOutputStream(out);
					String requestMessageLine = br.readLine();
					// Ŭ���̾�Ʈ���� �޽����� ù��° ���� �о���δ�.
					// GET /index.html HTTP/1.1
					if (requestMessageLine != null) {

						String[] data = requestMessageLine.split(" ");
						// data[0] = GET, data[1] = index.html
						if (data[0].equals("GET")) {
							String fileName = data[1];
							// �⺻������ ��Ʈ(/)�κ��� �ּҰ� �����ϹǷ� �����Ѵ�.
							if (fileName.startsWith("/") == true) {
								if (fileName.length() > 1) {
									fileName = fileName.substring(1);
								} else {
									fileName = "index.html";
								}
							}

							File file = new File("c:\\down\\webserver", fileName);

							if (file.exists()) {
								// �����ϴ� ������ MIMEŸ���� �м��Ѵ�.
								String mimeType = new MimetypesFileTypeMap().getContentType(file);
								// ������ ����Ʈ���� ã�ƿ´�.
								int numOfBytes = (int) file.length();

								// ������ ��Ʈ���� �о���� �غ� �Ѵ�.
								FileInputStream fis = new FileInputStream(file);
								byte[] readBytes = new byte[numOfBytes];
								fis.read(readBytes);

								// ���������� ó���� �Ǿ����� ��Ÿ���� 200 �ڵ带 ����Ѵ�.
								dos.writeBytes("HTTP/1.0 200 Document Follows \r\n");
								dos.writeBytes("Content-Type: " + mimeType + ";charset=utf-8" + "\r\n");

								// ����� �������� ���̸� ���
								dos.writeBytes("Content-Length: " + numOfBytes + "\r\n");
								dos.writeBytes("\r\n");

								// ��û ������ ����Ѵ�.
								dos.write(readBytes, 0, numOfBytes);
							} else {
								// ������ �������� �ʴ´ٴ� ������ 404 ������ ����ϰ� ������ �����Ѵ�.
								System.out.println("Requested File Not Found : " + fileName);
								byte[] body = ("Requested File Not Found" + fileName).getBytes();
								dos.writeBytes("HTTP/1.0 404 Not Found \r\n");
								dos.writeBytes("Connection: close\r\n");
								dos.writeBytes("Content-Type: text/html;charset=utf-8\r\n");
								dos.writeBytes("Content-Length: " + body.length + "\r\n");
								dos.writeBytes("\r\n");
								dos.write(body, 0, body.length);
								dos.writeBytes("\r\n");
							}
						}
					} else {
						// �߸��� ��û���� ��Ÿ���� 400 ������ ����ϰ� ������ �����Ѵ�.
						System.out.println("Bad Request");
						byte[] body = ("Bad Request").getBytes();
						dos.writeBytes("HTTP/1.0 400 Bad Request Message \r\n");
						dos.writeBytes("Connection: close\r\n");
						dos.writeBytes("Content-Type: text/html;charset=utf-8\r\n");
						dos.writeBytes("Content-Length: " + body.length + "\r\n");
						dos.writeBytes("\r\n");
						dos.write(body, 0, body.length);
						dos.writeBytes("\r\n");

					}
				} finally {
					if (socket != null)
						socket.close();
					System.out.println("Connection Closed");
				}
			}
		} finally {
			if(serverSocket != null) serverSocket.close();
		}
	}
}
