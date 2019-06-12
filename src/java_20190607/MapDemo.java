package java_20190607;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapDemo {
	public static void main(String[] args) {
		HashMap<String,String> map = new HashMap<String,String>();
		
		map.put("a", "1");
		map.put("b", "2");
		map.put("c", "3");
		map.put("d", "4");
		//Ű�� b�� ��ġ�鼭 ���߿� �� 22�� �����.
		map.put("b", "22");
		
		String temp1 = map.get("a");
		String temp2 = map.get("b");
		String temp3 = map.get("c");
		String temp4 = map.get("d");
	
		System.out.printf("%s, %s, %s, %s %n",temp1,temp2,temp3,temp4);
		
		//keySet() �޼���� HashMap�� �ִ� ��� Ű���� Set���� ��ȯ
		//Iterator�� ����ϴ� ����.
		Set<String> keys = map.keySet();
		Iterator<String> i = keys.iterator();
		while(i.hasNext()){
			String key = i.next();
			String value = map.get(key);
			System.out.printf("key : %s, value : %s %n", key, value);
		}
		
	}
}
