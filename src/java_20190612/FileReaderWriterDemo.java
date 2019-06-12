package java_20190612;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriterDemo {
	public static void main(String[] args) {
		FileReader fr = null;
		FileWriter fw = null;
	
	try {
		fr = new FileReader("c:\\down\\HelloWorld.java");
		fw = new FileWriter("c:\\down\\2019\\HelloWorld.java");
		//�� ���ھ� �о �Ѱ��� ���ڸ� ����ϴ� ����
		/*int readChar = 0;
		while((readChar = fr.read())!= -1){
			System.out.print((char)readChar);
			fw.write(readChar);
		}
		*/
		//�������� ����(char �迭)�� �о �������� ����(char �迭)�� ����ϴ� ����
		
		int readCharCount = 0;
		char[] readChar = new char[1024];
		while((readCharCount = fr.read(readChar))!= -1){
			System.out.print(new String(readChar, 0, readCharCount));
			fw.write(readChar, 0, readCharCount);
		}
		
		
	} catch (IOException e) {
		// TODO: handle exception
		e.printStackTrace();
	} finally{
		try{
			if(fr != null) fr.close();
			if(fw != null) fw.close();
		} catch (IOException e2){
			e2.printStackTrace();
		}
	}
		
	}
}
