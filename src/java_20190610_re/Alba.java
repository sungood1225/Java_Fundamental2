package java_20190610_re;

import java.util.ArrayList;

public class Alba extends Parent {

	String address;
	//Alt+Shift+S => o ������ �ڵ� ����
	public Alba(String name, String cphone, String address) {
		super();
		this.name = name;
		this.cphone = cphone;
		this.address = address;
	}

	//ctrl+shift+o => �ڵ� import
	ArrayList<Alba> list = new ArrayList<Alba>();
	
	public void insert(){
		list.add(new Alba(name,cphone,address));
	}
	
	public void delete(int i){
		list.remove(i);
	}
	
}
