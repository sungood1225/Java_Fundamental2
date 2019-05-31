package java_20190531;

public class Calculator {
	//접근한정자/instance/반환값유형/매써드이름-plus/매개변수
	public int plus(int first, int second){
		return first + second;
	}
	// 메쏘드 명이 위에랑 같음. 이를 오버로딩이라 한다. 
	// public int plus(int first)
	
	
	public int minus(int first, int second){
		return first - second;
	}
	
	public int multi(int first, int second){
		return first * second;	
	}
	
	public void p(int message){
		System.out.println(message);
	}
}









