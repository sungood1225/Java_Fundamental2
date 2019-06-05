package java_20190604;
//인터페이스 상속은 다중 상속이 가능함
public interface InterA extends InterB, InterC{
	//public static final 이 생략된거임, interface명.PI로 호출해지면 됨.
	double PI = 3.14;
	//abstract 안붙여도 저절로 추상 메소드. public 안붙여도 오직 public밖에 안됨
	void mA();
}
