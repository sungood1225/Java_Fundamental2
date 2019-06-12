package java_20190612;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class InputStreamReaderDemo {
	public static void main(String[] args) {
		InputStream in = null;
		InputStreamReader ir = null;
		BufferedReader br = null;
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		PrintWriter pw = null;
		
		try {
			//키보드로 입력을 받음, 다시 말해서 InputStream을 사용할 때 Source(대상)가 키보드임.
			in = System.in;
			//I바이트 입력 스트림을 2바이트 입력스트림으로 변환
			ir = new InputStreamReader(in);
			br = new BufferedReader(ir);
			
			fw = new FileWriter("C:\\down\\temp.txt",true);
			bw = new BufferedWriter(fw);
			pw = new PrintWriter(bw,true);
			
			boolean isStop = false;
			while(!isStop){
			System.out.print("입력하세요 >");
			//readLine이 커서가 깜밖거리는 역할
			String readLine = br.readLine();
			if(readLine.equals("exit")){
				isStop = true;
			}else{
			pw.println(readLine);
			}
		}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(in != null) in.close();
				if(ir != null) ir.close();
				if(br != null) br.close();
				if(fw != null) fw.close();
				if(bw != null) bw.close();
				if(pw != null) pw.close();
				
			} catch (IOException e2) {
				e2.printStackTrace();
			}
		} 
		
	}

	
	
}
