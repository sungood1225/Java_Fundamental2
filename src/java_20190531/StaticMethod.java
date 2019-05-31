package java_20190531;

import org.omg.Messaging.SyncScopeHelper;

public class StaticMethod {
	static String name;
	int age;
	
	public void m1(){
		name = "국민은행";
		age = 10;
		m2();
		m4();
	}
	public void m2(){
		System.out.println("instance method m2()");	
	}
	public static void m3(){
		name = "국민은행"; //static 메소드에서 static 변수 접근 불가 
		//age = 10; static 메소드에서 instance 변수 접근 불가 
		//m2(); static 메소드에서 instance 메소드 호출 불가 
		m4(); //static 메소드에서 static 메소드 호출 가능
	}
	public static void m4(){
		System.out.println("static method m4()");
	}
	public static void main(String[] args) {
		StaticMethod.m4();
		StaticMethod.name = "신한은행";
		//인스탄스 작업을 하고 싶으면 뉴로 생성해야함.
		//우리가 맨날 메인함수에서 뉴를 했던 이유~		
		StaticMethod sm = new StaticMethod();
		sm.age = 10;
		sm.m1();
		sm.m2();
		
	}
	}

