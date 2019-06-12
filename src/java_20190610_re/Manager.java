package java_20190610_re;

import java.util.ArrayList;

public class Manager extends Parent {

	String address;
	String id;
	String password;
	public Manager(String name, String cphone, String address, String id, String password) {
		super();
		this.name = name;
		this.cphone = cphone;
		this.address = address;
		this.id = id;
		this.password = password;
	}
	
	ArrayList<Manager> list = new ArrayList<Manager>();
	
	public void insert(){
		list.add(new Manager(name,cphone,address,id,password));
	}
	//겉으로 볼 때 alba, customer랑 똑같이 생겼지만 list가 다루는 객체가 다르기 떄문에 다른 메소드이다.
	public void delete(int i){
		list.remove(i);
	}

}
