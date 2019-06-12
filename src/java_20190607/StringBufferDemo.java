package java_20190607;

public class StringBufferDemo {
	public static void main(String[] args) {
		StringBuffer s1 = new StringBuffer();
		StringBuffer s2 = new StringBuffer();
		
		//문자연결할 때 append 사용
		s1.append("select name, age ");
		s1.append("from member ");
		s1.append("where name = '성영한' ");
		s1.append("order by name desc ");
		
		s2.append("select name, age ");
		s2.append("from member ");
		s2.append("where name = '성영한' ");
		s2.append("order by name desc ");
		
		
		//StringBuffer의  equals() 메서드는 Object 클래스의 equals() 메서드.
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		
		//s1이 스트링버퍼에서 스트링으로 변함.
		String s3 = s1.toString();
		String s4 = s2.toString();
		//string끼리는 문자열 비교 가능.
		System.out.println(s3.equals(s4));
		
		//s1의 값을 모두 지우기. setLength에 매개변수 0 대입.
		s1.setLength(0);
		s1.append("select no, writer from board");
		//아래는 s1.toString()이 생략된 것. StringBuffer 클래스는 Object의 toString() 메서드를 오버라이딩했기 때문에
		//StringBuffer 클래스의 문자열이 출력됨
		System.out.println(s1);
		
		
	}
}
