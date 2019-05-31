package java_20190531;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalendarDemo {
	//키보드로 입력받은 한줄을 반환하는 함수
	public static String console() throws IOException{
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		return br.readLine();
	}
	
	public static void main(String[] args) throws IOException{
		Calendar c = null;
		
		while(true){
		System.out.println("날짜를 입력하세요>");
		String readLine = console();
		if(readLine.equals("bye")) break;
		//readLine => 2019 05 31
		// split(" ") 공백문자로 문자열을 분리해서 배열로 반환
		//date[0]="2019", data[1]="5", data[2]="31"
		String[] data = readLine.split(" ");
		//Calendar 객체를 생성해서 아래의 모든 경우에 사용할 수 있다.
		c = new Calendar();
		//data.length 배열의 길이
		if(data.length ==1){
			//year = 2019;
			//integer.parseInt("2019") = 숫자 2019로 바꿔주는 함수이다.
			//--> 문자열을 숫자(int)로 바꿔주는 함수입니당 **자바에서 함수는 매써드를 지칭한다.
			int year = Integer.parseInt(data[0]);
			c = new Calendar();
			c.print(year);
		}else if(data.length == 2){
			int year = Integer.parseInt(data[0]);
			int month = Integer.parseInt(data[1]);
			c.print(year,month);
		}else if(data.length == 3){
			int year = Integer.parseInt(data[0]);
			int month = Integer.parseInt(data[1]);
			int day = Integer.parseInt(data[2]);
			c.print(year,month,day);
		}else{
		}
	}
	}
}

