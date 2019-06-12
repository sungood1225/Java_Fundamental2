package java_20190607;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDemo {
	public static void main(String[] args) {
		//ctrl + shift + O ������ import
		//<String>�� ���� ���ڿ��� ����־���� ��.
		//�������� �ߺ��� ������� �ʰ� ������ ����
		//HashSet<String> set1 = new HashSet<String>();
		
		//TreeSet�� �������� �ߺ��� ������� �ʰ�, natural ordering(�������� ����)
		// 0,1,10,11...(1���ͽ���),2,3,4.... ������ ���� ����.
		//TreeSet<String> set1 = new TreeSet<String>();
		
		//LinkedHashSet�� �������� �ߺ��� ������� �ʰ�, ���� ������� ����.
		LinkedHashSet<String> set1 = new LinkedHashSet<String>();
		
		
		//������ �߰�
		for(int i=0;i<20;i++){
			//valueOf(int i) �޼ҵ�� int i�� ���ڿ��� ��ȯ
		set1.add(String.valueOf(i));		
		}
		
		//HashSetũ��
		System.out.println(set1.size());

		//���������
		////ctrl + shift + O ������ import
		Iterator<String> iterator = set1.iterator();
		while(iterator.hasNext()){
			String temp = (String)iterator.next();
			System.out.println(temp);
			}
			
			Customer c1 = new Customer("ȫ�浿",10);
			Customer c2 = new Customer("ȫ�浿",10);
			Customer c3 = new Customer("ȫ�浿",10);
			Customer c4 = new Customer("ȫ�浿",10);
			
			//c1,c2,c3,c4�� ���� �ٸ� ��ü�� ������, Hascode�� add�� �� �޸𸮻��� ��ü�� �ƴ϶� ����� ��ü�� ���Ѵ�.
			HashSet<Customer> set2 = new HashSet<Customer>();
			set2.add(c1);
			set2.add(c2);
			set2.add(c3);
			set2.add(c4);

			System.out.println(set2.size());
			
			//��� �����
			//set1.clear();
			
			TreeSet<Integer> set3 = new TreeSet<Integer>();
			//�����ϱ�. math.random�� ��ȣ�� �� �����ָ� (int)Math.random�� 0�� �ȴ�.
			while(true){
				int random = (int)(Math.random()*45) + 1;
				set3.add(random);
				if(set3.size()==6) break;
			}
			
			Iterator<Integer> i = set3.iterator();
			while(i.hasNext()){
				Integer temp = i.next();
				System.out.print(temp+"\t");
			}
		
		}
		
}

class Customer{
	private String name;
	private int age;
	public Customer(String name, int age){
		super();
		this.name = name;
		this.age = age;
		
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
		}

