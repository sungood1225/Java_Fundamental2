package java_20190610_re;

import java.util.ArrayList;

public class Customer extends Parent{

	//Alt+Shift+S => o 持失切 切疑 持失
	public Customer(String name, String cphone) {
		super();
		this.name = name;
		this.cphone = cphone;
	}
	ArrayList<Customer> list = new ArrayList<Customer>();
	public void insert(){
		list.add(new Customer(name,cphone));
	}
	
	public void delete(int i){
		list.remove(i);
	}
	
}
