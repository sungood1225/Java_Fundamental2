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
	//������ �� �� alba, customer�� �Ȱ��� �������� list�� �ٷ�� ��ü�� �ٸ��� ������ �ٸ� �޼ҵ��̴�.
	public void delete(int i){
		list.remove(i);
	}

}
