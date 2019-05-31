package java_20190530;

public class Customer {
	// 여기가 멤버변수 (class 아래/안)
	// 아래 2개는 인스턴스 변수
	String name;
	String cphone;
	// 아래 얘는 스태틱 변수
	static double interestRate ;
	// 파이널 변수는 대문자로 쓴다 (BANKNAME) 파이널변수는 static 변수인 경우가 100%
	static final String BANKNAME = "신한은행";
	// 여기가 멤버변수 (Method 위에/밖)
	public void register(){
		System.out.println("고객이 등록 되었습니다.");
		// name, cphone, interestrate는 위에서 이미 명명한 애들이라 쌍따옴표 안하고 +만 붙여도 인식 가능.
		System.out.println("이름 : "+ name + " , 핸드폰 번호 : "+cphone+", 이자율: "+interestRate+
				", 은행명 :"+BANKNAME);
	}
}
