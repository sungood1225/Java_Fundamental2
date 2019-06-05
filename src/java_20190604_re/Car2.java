package java_20190604_re;

import org.omg.Messaging.SyncScopeHelper;

public class Car2 {
	String modelNumber;
	String color;
	int year;
//메소드명이 클래스 이름과 동일하면서 반환값이 없으면 생성자다!!
//인스탄스 변수 초기화할 때 쓰는 것이 생성자
	public Car2(String modelNumber, String color, int year){
		//매개변수와 인스탄스변수가 동일하기 때문에 구분짓기 위해  this를 사용.
		this.modelNumber = modelNumber;
		this.color = color;
		this.year = year;
		}
	
	public static void main(String[] args) {
	Car2 c1 = new Car2("01000000", "white", 2018);
	System.out.println("첫번째 객체 출력하기");
	System.out.println(c1.modelNumber + "\t" + c1.color + "\t" + c1.year);
	
	Car2 c2 = new Car2("01010101", "black", 2019);
	System.out.println("두번째 객체 출력하기");
	System.out.println(c2.modelNumber + "\t" + c2.color + "\t" + c2.year);		

	Car2 c3 = new Car2("11112333", "red", 2017);
	System.out.println("세번째 객체 출력하기");
	System.out.println(c3.modelNumber + "\t" + c3.color + "\t" + c3.year);

	
	}
	
	
}
