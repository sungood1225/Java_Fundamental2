package java_20190531;

import org.omg.Messaging.SyncScopeHelper;

public class StaticMethod {
	static String name;
	int age;
	
	public void m1(){
		name = "��������";
		age = 10;
		m2();
		m4();
	}
	public void m2(){
		System.out.println("instance method m2()");	
	}
	public static void m3(){
		name = "��������"; //static �޼ҵ忡�� static ���� ���� �Ұ� 
		//age = 10; static �޼ҵ忡�� instance ���� ���� �Ұ� 
		//m2(); static �޼ҵ忡�� instance �޼ҵ� ȣ�� �Ұ� 
		m4(); //static �޼ҵ忡�� static �޼ҵ� ȣ�� ����
	}
	public static void m4(){
		System.out.println("static method m4()");
	}
	public static void main(String[] args) {
		StaticMethod.m4();
		StaticMethod.name = "��������";
		//�ν�ź�� �۾��� �ϰ� ������ ���� �����ؾ���.
		//�츮�� �ǳ� �����Լ����� ���� �ߴ� ����~		
		StaticMethod sm = new StaticMethod();
		sm.age = 10;
		sm.m1();
		sm.m2();
		
	}
	}

