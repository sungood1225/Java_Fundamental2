package java_20190612;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferedInputOutputDemo {
	public static void main(String[] args) {
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		try {
			fis = new FileInputStream("C:\\down\\eclipse.zip");
			//stream chaining
			bis = new BufferedInputStream(fis);
			
			fos = new FileOutputStream("C:\\down\\2019\\06\\eclipse.zip");
			//stream chaining
			bos = new BufferedOutputStream(fos);
			
			int readByteCount = 0;
			byte[] readByte = new byte[1024];
			while((readByteCount = bis.read(readByte))!=-1){
				bos.write(readByte, 0, readByteCount);
			}
			//���۰����� �� ������ �ʴ���  ���۰����� ����ִ� ����
			bos.flush();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				if(fis !=null) fis.close();
				if(bis !=null) bis.close();
				if(fos !=null) fos.close();
				if(bos !=null) bos.close();
				
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
		}
	}
}
}