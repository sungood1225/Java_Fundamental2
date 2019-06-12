package java_20190607;

import java.util.ArrayList;

public class GenericDemo {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("1");
		list.add("2");
		list.add("3");
		//list.add(10);
//제너리 선언을 안하면 list.add(10)도 넣을 수 있다. boxing 되어서 int class인 10이 들어감.
		for(int i=0;i<list.size();i++){
			//제너릭 선언을 안하면 아래 String이라고 함부로 쓸 수 없음, String으로 캐스팅해도 String이 아닌 변수가 추가되면 출력값이 에러가 난다.
			//그리고 제너릭선언을 안하면 inhance for도 못씀
			//실행할 때 데이터안정성을 보장할 수 있는 장치.
			String temp = (String)list.get(i);
			System.out.println(temp);
		}
		
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("1");
		list1.add("2");
		list1.add("3");
		//list1.add(10);
//제너리 선언을 안하면 list.add(10)도 넣을 수 있다. boxing 되어서 int class인 10이 들어감.
		for(int i=0;i<list1.size();i++){
			//제너릭 선언을 안하면 아래 String이라고 함부로 쓸 수 없음, String으로 캐스팅해도 String이 아닌 변수가 추가되면 출력값이 에러가 난다.
			//그리고 제너릭선언을 안하면 inhance for도 못씀
			//실행할 때 데이터안정성을 보장할 수 있는 장치.
			String temp = list1.get(i);
			System.out.println(temp);
	}
		for(String temp : list1){
			System.out.println(temp);
		}
	}		
}
