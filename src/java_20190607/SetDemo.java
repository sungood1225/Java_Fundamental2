package java_20190607;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDemo {
	public static void main(String[] args) {
		//ctrl + shift + O 단축기로 import
		//<String>의 뜻은 문자열만 집어넣어라의 뜻.
		//데이터의 중복을 허용하지 않고 순서가 없음
		//HashSet<String> set1 = new HashSet<String>();
		
		//TreeSet은 데이터의 중복을 허용하지 않고, natural ordering(오름차순 정렬)
		// 0,1,10,11...(1부터시작),2,3,4.... 쓸일은 별로 없다.
		//TreeSet<String> set1 = new TreeSet<String>();
		
		//LinkedHashSet은 데이터의 중복을 허용하지 않고, 넣은 순서대로 나옴.
		LinkedHashSet<String> set1 = new LinkedHashSet<String>();
		
		
		//데이터 추가
		for(int i=0;i<20;i++){
			//valueOf(int i) 메소드는 int i를 문자열로 변환
		set1.add(String.valueOf(i));		
		}
		
		//HashSet크기
		System.out.println(set1.size());

		//데이터출력
		////ctrl + shift + O 단축기로 import
		Iterator<String> iterator = set1.iterator();
		while(iterator.hasNext()){
			String temp = (String)iterator.next();
			System.out.println(temp);
			}
			
			Customer c1 = new Customer("홍길동",10);
			Customer c2 = new Customer("홍길동",10);
			Customer c3 = new Customer("홍길동",10);
			Customer c4 = new Customer("홍길동",10);
			
			//c1,c2,c3,c4는 서로 다른 객체가 맞지만, Hascode는 add할 때 메모리상의 객체가 아니라 내용상 객체를 비교한다.
			HashSet<Customer> set2 = new HashSet<Customer>();
			set2.add(c1);
			set2.add(c2);
			set2.add(c3);
			set2.add(c4);

			System.out.println(set2.size());
			
			//모두 지우기
			//set1.clear();
			
			TreeSet<Integer> set3 = new TreeSet<Integer>();
			//주의하기. math.random에 괄호를 잘 안쳐주면 (int)Math.random이 0이 된다.
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

