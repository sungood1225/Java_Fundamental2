package java_20190603;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LotteryDemo {
	//키보드로 입력받은 한줄을 반환하는 함수
		public static String console() throws IOException{
			BufferedReader br = new BufferedReader(
					new InputStreamReader(System.in));
			return br.readLine();
		}
	public static void main(String[] args) throws IOException {
		Lottery lottery = new Lottery();
		while(true){
			System.out.println("로또복권 개수를 입력하세요>");
			String readLine = console();
			if(readLine.equals("bye")) break;
			int count = Integer.parseInt(readLine);
			lottery.print(count);
		}
	
	}
}