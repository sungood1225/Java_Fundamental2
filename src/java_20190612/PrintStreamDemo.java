package java_20190612;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class PrintStreamDemo {
	public static void main(String[] args) {
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		PrintStream ps = null;	
		
		
		try {
			fis = new FileInputStream("C:\\down\\eclipse.zip");
			bis = new BufferedInputStream(fis);
			fos = new FileOutputStream("C:\\down\\2019\\06\\eclipse.zip");
			bos = new BufferedOutputStream(fos);
			
			//PrintStream의 목적지는 파일
			ps = new PrintStream(bos,true); // true=>autoFlush
			
			int readByteCount = 0;
			byte[] readBytes = new byte[2014];
			while((readByteCount = bis.read(readBytes))!= -1){
				ps.write(readBytes, 0, readByteCount);
			}
			
			//PrintStream의 목적지를 모니터
			PrintStream ps1 = System.out;
			ps1.println(1);
			ps1.println("aaaa");
			ps1.println(42.5);
			
		} catch (IOException e) {
			// TODO: handle exception
		} finally{
			try{
				if(fis !=null) fis.close();
				if(bis !=null) bis.close();
				if(fos !=null) fos.close();
				if(bos !=null) bos.close();
				if(ps !=null) ps.close();
			}catch (IOException e2){
				e2.printStackTrace();
			}
		}
	}	
}
