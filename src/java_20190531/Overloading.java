package java_20190531;
//오버로딩이란 클래스안에서 메쏘드 이름이 같아도 상관 없다.
//오버로딩 안하면 불편함.
//목적어 별로 메쏘드를 만들 필요가 절대절대 없음. 동사위주로 만들기! print가 공통동사이니~
public class Overloading {
	public void print(int i){
		System.out.println(i);
	}
	
	public void print(String s){
		System.out.println(s);
	}
	
	public void print(double d){
		System.out.println(d);
	}
	//printInt라는 이름은 좋지 않은 이름...~~
	public void printInt(int i){
		System.out.println(i);
	}

}
