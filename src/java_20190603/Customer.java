package java_20190603;

//String이 에러가 나지 않는 이유는 java.lang* 패키지 내 모든 클래스가 끌려옴
import java.lang.*; 
//Object는 최상위권의 부모클래스, 생략해도 저절로 끌려온다.
//클래스중 부모 클래스가 없는 경우 묵시적으로 Object 클래스를 상속
//하고 있으며 java.lang.* 패키지를 import 하고 있음
public class Customer extends Object{
	String name;
	String cphone;	
	
	public void actionCustomer(){
		System.out.println("Customer actionCustomer()");
	}
}
