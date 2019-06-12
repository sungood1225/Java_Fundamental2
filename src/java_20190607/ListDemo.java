package java_20190607;

import java.util.ArrayList;

public class ListDemo {
	public static void main(String[] args) {
		//데이터의 중복을 허용하고, 순서를 관리한다.
		//배열과 완벽하게 동일하면서 확장과 축소가 자동으로 가능.
		ArrayList<String> list = new ArrayList<String>();
		//입력 add(객체)
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		
		//여기서 i는 list의 index를 의미한다.
		//출력은 get(index)
		for(int i=0;i<list.size();i++){
			String temp = list.get(i);
			System.out.println(temp);
		}
		
		//enhanced for문. for(타입변수명 : 배열 또는 컬렉션) {반복할 문장} : 모든 요소를 출력하는 for문
		//오류가 덜 발생한다.
		for(String temp : list){
			System.out.println(temp);
		}
		
		list.remove(2);
		//순서가 자동으로 shift가 되어 4가 나온다~!
		String temp = list.get(2);
		//String temp1 = list.get(3);
		System.out.println(temp);
		//에러가 나오는 이유. get(3)가 있지도 않은 인덱스이기 때문.
		//System.out.println(temp2);
		
		/*배열과의 비교.
		 String[] s = new String [4]
		 s[0] = "1";
		 s[1] = "2";
		 s[2] = "3";
		 s[3] = "4";
		 
		 여기는 "5"를 추가하려면 너무 복잡함. 배열은 확장이 안됨...
		 System.arraycopy(~~)
		 s[4] = "5"
		 
		 */
		
	}
}
