package java_20190612;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutputTestDemo {
	public static void main(String[] args) {
		FileInputStream fin = null;
		FileOutputStream fos = null;
		
		try {
			fin = new FileInputStream("C:\\down\\eclipse.zip");
			fos = new FileOutputStream("C:\\down\\2019\\eclipse.zip");
			
			long start = System.currentTimeMillis();
			int readByteCount = 0;
			byte[] readBytes = new byte[10240];
			while((readByteCount = fin.read(readBytes))!=-1){
				//��� ��Ʈ������ ����Ʈ �迭 b�� start���� length��ŭ �����Ѵ�.
				fos.write(readBytes, 0, readByteCount);
			}
			
			long end = System.currentTimeMillis();
			System.out.println("�����ð� : "+(end-start));
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e){
			e.printStackTrace();
		}finally {
			try {
				if(fin !=null) fin.close();
				if(fos !=null) fos.close();
			}catch(IOException e2){
				e2.printStackTrace();
			}
		}

		
		
	}
}
