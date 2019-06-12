package java_20190612;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;

public class NaverCafeScanningDemo {
	public static void main(String[] args) {
		InputStream in = null;
		InputStreamReader ir = null;
		BufferedReader br = null;
		FileWriter fw = null;
		BufferedWriter bw = null;
		PrintWriter pw = null;
		
		try {
			URL url = new URL
					("https://blog.naver.com/PostView.nhn?blogId=yanadooblog&logNo=221559797523&redirect=Dlog&widgetTypeCall=true&directAccess=false");
			in = url.openStream();
			ir = new InputStreamReader(in,"UTF-8");
			br = new BufferedReader(ir);
/*			fw = new FileWriter("C:\\down\\naver.html");
			bw = new BufferedWriter(fw);*/
			pw = new PrintWriter("C:\\down\\naver.html","UTF-8");
			
			String readLine = null;
			while((readLine=br.readLine())!=null){
				System.out.println(readLine);
				pw.println(readLine);
			}
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
	
				try {
					if(in != null) in.close();
					if(ir != null) ir.close();
					if(br != null) br.close();
					if(fw != null) fw.close();
					if(bw != null) bw.close();
					if(pw != null) pw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

		}
		
	}
}
