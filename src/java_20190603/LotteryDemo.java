package java_20190603;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LotteryDemo {
	//Ű����� �Է¹��� ������ ��ȯ�ϴ� �Լ�
		public static String console() throws IOException{
			BufferedReader br = new BufferedReader(
					new InputStreamReader(System.in));
			return br.readLine();
		}
	public static void main(String[] args) throws IOException {
		Lottery lottery = new Lottery();
		while(true){
			System.out.println("�ζǺ��� ������ �Է��ϼ���>");
			String readLine = console();
			if(readLine.equals("bye")) break;
			int count = Integer.parseInt(readLine);
			lottery.print(count);
		}
	
	}
}