package java_20190530;

public class Member {
	// 이제 인스탄스 변수는 습관적으로 private을 쓰자. 정보의 은닉화. 그렇게 해서 인캡슐레이션을 하면 좋다.
	private String name;
	private String cphone;
	private String address;
	private String zipcode;
	
	//알트 시프트 s r tab enter tab tab tab tab enter, 세터 게터 단축기.  
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCphone() {
		return cphone;
	}
	public void setCphone(String cphone) {
		this.cphone = cphone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	

	

}
