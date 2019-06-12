package java_20190611;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutputDemo {
	public static void main(String[] args) {
		FileInputStream fin = null;
		FileOutputStream fos = null;
		try {
			fin = new FileInputStream("C:\\down\\eclipse.zip");
			//FileOUtputStream은 생성할때 name을 아직 안만들어진 거라도 미리 써놓으면 된다. 심지어 레퍼토리도!!
			fos = new FileOutputStream("C:\\down\\2019\\eclipse.zip");
			
/*			int readByte = 0;
			try {
				while((readByte = fin.read()) != -1){
					fos.write(readByte);			}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			*/
			long start = System.currentTimeMillis();
			
			int readByteCount = 0;
			byte[] readBytes = new byte[10240];
			while((readByteCount = fin.read(readBytes))!= -1){
				fos.write(readBytes,0,readByteCount);
			} 			
			long end = System.currentTimeMillis();
			
			System.out.println("경과시간 : "+(end-start));
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		}finally {
				
			try {
				if(fin != null) fin.close();
				if(fos != null) fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
